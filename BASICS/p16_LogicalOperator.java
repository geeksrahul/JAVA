// Used to combine multiple boolean expressions.
class LogicalOperator {
    public static void main(String[] args) {
        // Logical AND Operation
        System.out.println( true && true); // true
        System.out.println( true && false); // false
        System.out.println( false && true); // false
        System.out.println( false && false); // false
        // Logical OR Operation
        System.out.println( true || false); // true
        System.out.println( false || true); // true
        System.out.println( true || true); // true
        System.out.println( false || false); // false 
        // Logical NOT Operator 
        System.out.println( !true ); // false
        System.out.println( !false ); // true
    }

}