import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Language : ");
        String language = sc.next();
        switch (language) {
            case "hindi":
                System.out.println(" alvida ");
                break;
            case "gujarati":
                System.out.println(" aavjo ");
                break;
            case "english":
                System.out.println(" good bye ");
                break;
            case "japanese":
                System.out.println(" ciao ");
                break;
            default:
                System.out.println(" no language found !");
                break;
        }
    }
}
