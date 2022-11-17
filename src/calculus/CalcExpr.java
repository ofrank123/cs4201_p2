package calculus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CalcExpr {
    // Flag to check whether a reduction has been performed, or if we've reached a normal form (if one exists)
    static boolean reductionPerformedFlag = true;

    // Check whether a reduction has been performed since the flag was last unset
    public static boolean checkReductionFlag () {
        return reductionPerformedFlag;
    }

    // Set the reduction flag
    public static void reductionPerformed() {
        reductionPerformedFlag = true;
    }

    // Unset the reduction flag
    public static void unsetReductionFlag() {
        reductionPerformedFlag = false;
    }

    // Store any sub expressions this expression might have
    List<CalcExpr> children = new ArrayList<>();

    // Copy expression without links
    public abstract CalcExpr deepCopy();

    // Returns expression with substitutions performed
    public CalcExpr substitute(Map<String, CalcExpr> environment) {
        // Call the internal method, which uses a level to use for creating DeBruijn indices
        return this.substitute_internal(environment, 0);
    }

    CalcExpr substitute_internal(Map<String, CalcExpr> environment, int level) {
        // Default implementation:
        // Perform substitution on all children
        children.replaceAll(calcExpr -> calcExpr.substitute_internal(environment, level));
        return this;
    }

    // Return type for removeRecursiveCalls
    public static class RemoveRecursiveCallsResult {
        public boolean anyRecursiveCalls;
        public CalcExpr expr;

        public RemoveRecursiveCallsResult(boolean anyRecursiveCalls, CalcExpr expr) {
            this.anyRecursiveCalls = anyRecursiveCalls;
            this.expr = expr;
        }
    }

    // Remove recursive calls from
    public RemoveRecursiveCallsResult removeRecursiveCalls(int index, String name) {
        // Default Implementation:
        // Perform the method on each child, setting anyRecursiveCalls to true if any of the children had recursive calls
        AtomicBoolean anyRecursiveCalls = new AtomicBoolean(false);
        children.replaceAll(calcExpr -> {
            RemoveRecursiveCallsResult res = calcExpr.removeRecursiveCalls(index, name);
            if (res.anyRecursiveCalls) anyRecursiveCalls.set(true);
            return res.expr;
        });
        return new RemoveRecursiveCallsResult(anyRecursiveCalls.get(), this);
    }

    public CalcExpr betaReduce(int index, CalcExpr arg) {
        // Default Implementation:
        // Perform beta reduction on all children
        children.replaceAll(calcExpr -> calcExpr.betaReduce(index, arg));
        return this;
    }

    public abstract CalcExpr reduce();
}
