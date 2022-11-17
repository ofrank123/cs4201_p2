package calculus;

/** Represents a DeBruijn index (that is, a variable), in the lambda calculus
 */
public class IndexExpr extends CalcExpr {
    int idx;
    String name;

    public IndexExpr(String name, int idx) {
        this.name = name;
        this.idx = idx;
    }

    public void increment(int inc) {
        idx += inc;
    }

    @Override
    public CalcExpr deepCopy() {
        return new IndexExpr(name, idx);
    }

    @Override
    public String toString() {
        return name + "@" + idx;
    }

    @Override
    public CalcExpr betaReduce(int index, CalcExpr arg) {
        // Replace this DeBruijn index if it matches the current index being reduced
        if (index == this.idx) {
            CalcExpr expr = arg.deepCopy();
            // Increment the index by the number of lambdas it is now under, compared to previously
            if (expr instanceof IndexExpr idxExpr) {
                idxExpr.increment(index);
            }
            return expr;
        }
        // If this variable is free in the statement being beta reduced, we need to decrement the index
        if (this.idx > index) {
            idx--;
        }

        return this;
    }

    @Override
    public CalcExpr reduce() {
        // Can't reduce an index on its own
        return this;
    }
}
