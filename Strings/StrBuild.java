import java.util.Scanner;
public class StrBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Rahul");
        System.out.println(sb);
        // System.out.println(sb.charAt(2)); // charAt()
        
        // // set character at index
        // sb.setCharAt(0, 'r');
        // System.out.println(sb);

        sb.insert(0, "Baraiya ");
        System.out.println(sb);

        sb.delete(7,sb.length());
        System.out.println(sb);

        // append()
        // length()
        
    }
}
