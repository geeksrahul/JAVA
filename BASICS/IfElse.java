import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        // if-else statement
        if(age >= 18) {
            System.out.println("Okay sir, Please Welcome !");
        } else {
            System.out.println("Sorry sir, but you can't enter !");
        }
        System.out.println("Have a nice day..."); 
    }
}
