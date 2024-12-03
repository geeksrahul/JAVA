
import java.util.Scanner;
class Main{
    // no argument, no return
    public static void goodMorning() {
        System.out.println("Good Morning");
    }
    // no argument, with return
    public static String askName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name ? : ");
        String name = sc.next();
        return name;
    }
    // with argument, no return
    public static void greet(String name) {
        System.out.println("Good Morning, "+name);
    }
    // with argument, with return
    public static String getNickname(String name) {
        return name+"7";
    }
    public static void main(String[] args) {
        goodMorning();
        String name = askName();
        String nickName = getNickname(name);
        greet(nickName);
    }
    
}