package calculus;

/** Represents an Application Expression in the lambda calculus
 * Expression is of the form: (funcExpr argExpr)
 * children.get(0) = funcExpr
 * children.get(1) = argExpr
 */
public class ApplicationExpr extends CalcExpr {
    public ApplicationExpr(CalcExpr funcExpr, CalcExpr argExpr) {
        children.add(funcExpr);
        children.add(argExpr);
    }

    @Override
    public CalcExpr deepCopy() {
        return new ApplicationExpr(children.get(0).deepCopy(), children.get(1).deepCopy());
    }

    @Override
    public CalcExpr reduce() {
        CalcExpr funcExpr = children.get(0);
        CalcExpr argExpr = children.get(1);

        // If the funcExpr is a lambda, we can perform a beta reduction
        if (funcExpr instanceof LambdaExpr lambdaExpr) {
            // Set the flag
            reductionPerformed();
            return lambdaExpr.reduce(argExpr);
        } else {
            // Attempt to reduce the function expression
            children.set(0, funcExpr.reduce());

            if (!checkReductionFlag()) { // If no reduction performed
                children.set(1, argExpr.reduce()); // Try to reduce the arg expr
            }
            return this;
        }
    }

    @Override
    public String toString() {
        return "(" + children.get(0).toString() + " " + children.get(1) + ")";
    }
}
