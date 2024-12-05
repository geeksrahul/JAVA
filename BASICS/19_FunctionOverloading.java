class FunctionOverloading {
    public static void display(int data) {
        System.out.println("int: "+data);
    }
    public static void display(String data) {
        System.out.println("String: "+data);
    }
    public static void display(float data) {
        System.out.println("float: "+data);
    }
    public static void display(double data) {
        System.out.println("double: "+data);
    }
    public static void main(String[] args) {
        display(1);
        display("Rahul");
        display(23.3);
        display(23.3f);
    }
}
