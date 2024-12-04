import java.util.Scanner;
class FunctionsDemo {
    // no return, no argument
    public static void goodMorning() {
        System.out.println("Good Morning");
    }
    // with return, no argument
    private static String askName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey buddy, what's your name ?");
        return sc.next();
    }
    // no return, with argument
    private static void greet(String name) {
        System.out.println("Nice to meet you "+name);
    }
    // with return, with argument
    public static String getNickName(String name) {
        return name+"7";
    }
    public static void main(String[] args) {
        goodMorning(); // good morning
        String name = askName(); // whats your name ? : rahul
        greet(getNickName(name)); // nice to meet you rahul7
    }
}
