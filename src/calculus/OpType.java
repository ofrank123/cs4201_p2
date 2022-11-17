package calculus;

/** Enum representing an operator in the lambda calculus
 *
 */
public enum OpType {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    EQ("=="),
    NEQ("<>"),
    LT("<"),
    GT(">"),
    LTE("<="),
    GTE(">=");

    final String s;

    OpType(String s) {
        this.s = s;
    }

    // Get the appropriate operator from a string
    public static OpType fromString(String s) {
        for (OpType t : OpType.values()) {
            if (t.s.equals(s)) return t;
        }
        throw new Error("Operation \"" + s + "\" not supported");
    }

    // Convert a boolean value into the appropriate lambda calculus expression
    static CalcExpr getBool(boolean b) {
        if (b) {
            return new LambdaExpr("a", new LambdaExpr("b", new IndexExpr("a", 1)));
        } else {
            return new LambdaExpr("a", new LambdaExpr("b", new IndexExpr("b", 0)));
        }
    }

    // Perform the given operation
    public CalcExpr performOp(int lhs, int rhs) {
        return switch (this) {
            case ADD -> new ConstantExpr(lhs + rhs);
            case SUB -> new ConstantExpr(lhs - rhs);
            case MUL -> new ConstantExpr(lhs * rhs);
            case DIV -> new ConstantExpr(lhs / rhs);
            case EQ -> getBool(lhs == rhs);
            case NEQ -> getBool(lhs != rhs);
            case LT -> getBool(lhs < rhs);
            case GT -> getBool(lhs > rhs);
            case LTE -> getBool(lhs <= rhs);
            case GTE -> getBool(lhs >= rhs);
        };
    }

    @Override
    public String toString() {
        return s;
    }
}
