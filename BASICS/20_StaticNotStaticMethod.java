class StaticNotStatic {
    public static void staticDisplay(String data) {
        System.out.println(data);
    }
    public void display(String data) {
        System.out.println(data);
    }
    public static void main(String[] args) {
        staticDisplay("calling static method without object");
        StaticNotStatic sns = new StaticNotStatic();
        sns.display("calling non static method");
        sns.staticDisplay("calling static method using object");
    }
}
