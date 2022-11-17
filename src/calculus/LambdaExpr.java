package calculus;

import java.util.Map;

public class LambdaExpr extends CalcExpr {
    String argName;

    public LambdaExpr(String argName, CalcExpr expr) {
        this.argName = argName;
        children.add(expr);
    }

    @Override
    public CalcExpr deepCopy() {
        return new LambdaExpr(argName, children.get(0).deepCopy());
    }

    @Override
    public String toString() {
        return "(λ " + argName + ". " + children.get(0).toString() + ")";
    }

    @Override
    CalcExpr substitute_internal(Map<String, CalcExpr> environment, int level) {
        // Increment index, because we're passing a lambda
        return super.substitute_internal(environment, level + 1);
    }

    @Override
    public CalcExpr betaReduce(int index, CalcExpr arg) {
        // Increment index, because we're passing a lambda
        return super.betaReduce(index + 1, arg);
    }

    // Perform a beta reduction
    public CalcExpr reduce(CalcExpr arg) {
        return children.get(0).betaReduce(0, arg);
    }

    @Override
    public CalcExpr reduce() {
        // Try to reduce the expression inside the lambda expression, to get a normal form if one exists
        children.set(0, children.get(0).reduce());
        return this;
    }
}
