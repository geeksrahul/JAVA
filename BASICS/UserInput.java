// importing Scanner class from java utility.
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        // creating instance of Scanner class,
        // it takes System.in as parameter in constructor
        Scanner sc = new Scanner(System.in);
        // using sc object, we have access of different methods of scanner class
        // all these methods are used in different different scenario
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine(); // to take string(textual data) data
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt(); // to take int data
        System.out.print("Enter Your Weight : ");
        float weight = sc.nextFloat(); // to take float data
        System.out.println("--------------");
        System.out.println("Medical Report");
        System.out.println("--------------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Weight : "+weight);
        // similarly we can use different method to accept different type of data like boolean, byte, double, etc..
        // at the end of program, it is good practice to close scanner class object
        sc.close();
    }
}
