package calculus;

import java.util.Map;

/** Represents an identifier that needs to be substituted using the substitute method before evaluation.
 * These are left by FVisitor as it builds the lambda calculus expression, and then substituted when the
 * required information has been gathered.
 */
public class IdentSub extends CalcExpr {
    String name;

    public IdentSub(String name) {
        this.name = name;
    }

    @Override
    public CalcExpr deepCopy() {
        return new IdentSub(name);
    }

    @Override
    public CalcExpr substitute_internal(Map<String, CalcExpr> environment, int level) {
        // Substitute if environment contains this identifier
        if (environment.containsKey(name)) {
            CalcExpr expr = environment.get(name).deepCopy();
            // If its an index, increment by however many lambdas deep in the expression we are
            if (expr instanceof IndexExpr idxExpr) {
                idxExpr.increment(level);
            }

            // Substitute sub expressions
            return expr.substitute_internal(environment, level);
        }
        return this;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public RemoveRecursiveCallsResult removeRecursiveCalls(int index, String name) {
        // If there are recursive calls, we need to abstract over
        if (this.name.equals(name)) {
            return new RemoveRecursiveCallsResult(true, new IndexExpr("f", index));
        } else {
            return new RemoveRecursiveCallsResult(false, this);
        }
    }

    @Override
    public CalcExpr betaReduce(int index, CalcExpr arg) {
        // We should not be reducing before the substitutions are made
        throw new Error("All subs should be replaced before reduction!");
    }

    @Override
    public CalcExpr reduce() {
        // We should not be reducing before the substitutions are made
        throw new Error("All subs should be replaced before reduction!");
    }
}
