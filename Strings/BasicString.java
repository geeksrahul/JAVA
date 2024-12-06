// string are used to define text, words, sentence, sequence of characters
import java.util.Scanner;
public class BasicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // string declaration
        // String str;
        // // string initialisation
        // String name = "Rahul";
        // String sentence = "My name is rahul baraiya";
        // string input
        // str = sc.nextLine();
        // string output
        // System.out.println(str);

        // string concatination : merging two string
        // String firstname = "Rahul";
        // String lastname = "Baraiya";
        // String fullname = firstname +" "+ lastname;
        // System.out.println(fullname);
        // // length of string (total number of character)
        // System.out.println(fullname.length());
        // // charAt( : return character present at specified index
        // for(int i=0; i<firstname.length(); i++) {
        //     System.out.println("character : " + firstname.charAt(i));
        // compare two string
        // str1 > str2 : positive
        // str1 = str2 : 0
        // // str1 < str2 : negative
        // String str1 = "Rahul";
        // String str2 = "Rahul";
        // String str3 = new String("Rahul");
        // String str4 = new String("Rahul");
        // System.out.println("str1 == str2 :" + (str1 == str2));
        // System.out.println("str3 == str4 :" + (str3 == str4));
        // System.out.println("str1 compare to str2 :" + str1.compareTo(str2));
        // System.out.println("str3 compare to str4 :" + str3.compareTo(str4));
        // System.out.println("str" + str1.compareToIgnoreCase(str2));

        // substring

        String text = "my name is rahul baraiya";
        String name = text.substring(11,24);
        System.out.println(name);
        // converting numeric string to integer 
        String number1 = "4";
        String number2 = "3";
        int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
        System.out.println(sum);
    }
}
