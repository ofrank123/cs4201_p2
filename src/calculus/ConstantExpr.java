package calculus;

/** Represents an integer constant in the lambda calculus
 */
public class ConstantExpr extends CalcExpr {
    int value;

    public ConstantExpr(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public CalcExpr deepCopy() {
        return new ConstantExpr(value);
    }

    @Override
    public CalcExpr reduce() {
        // Can't reduce a constant
        return this;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
