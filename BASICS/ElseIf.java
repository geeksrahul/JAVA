import java.util.Scanner;

public class ElseIf {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        // else-if
        if(age >= 21) {
            System.out.println("Okay sir, Please Welcome !");
        } else if(age >= 18) {
            System.out.println("Okay sir you can enter but be in limit");
        }else {
            System.out.println("Sorry sir, but you can't enter !");
        }
        System.out.println("Have a nice day..."); 
   } 
}
