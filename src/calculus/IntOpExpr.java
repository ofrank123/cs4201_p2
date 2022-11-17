package calculus;

/** Represents an arithmetic operation in the lambda calculus
 * Expression takes the form: (lhs <operator> rhs)
 * children.get(0) = lhs
 * children.get(1) = rhs
 */
public class IntOpExpr extends CalcExpr {
    OpType opType;

    public IntOpExpr(OpType opType, CalcExpr lhs, CalcExpr rhs) {
        this.opType = opType;
        children.add(lhs);
        children.add(rhs);
    }

    @Override
    public CalcExpr deepCopy() {
        return new IntOpExpr(opType, children.get(0).deepCopy(), children.get(1).deepCopy());
    }

    @Override
    public String toString() {
        return "(" + children.get(0).toString() + " " + opType.toString() + " " + children.get(1).toString() + ")";
    }

    @Override
    public CalcExpr reduce() {
        CalcExpr lhs = children.get(0);
        CalcExpr rhs = children.get(1);

        // If both lhs and rhs are fully reduced, perform operation
        if (lhs instanceof ConstantExpr constLhs && rhs instanceof ConstantExpr constRhs) {
            reductionPerformed();
            return opType.performOp(constLhs.getValue(), constRhs.getValue());
        } else if (!(lhs instanceof ConstantExpr)) { // Left hand side of operation needs reducing
            children.set(0, lhs.reduce());
            return this;
        } else { // Right hand side of operation needs reducing
            children.set(1, rhs.reduce());
            return this;
        }
    }
}
