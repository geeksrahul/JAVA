import java.util.Scanner;
class SimpleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        // simple if statement
        if(age >= 18) {
            System.out.println("Okay sir, Please Welcome !");
        }
        System.out.println("Have a nice day...");
    }
}
