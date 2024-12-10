public class p22_Recursion {
    // public static void print(int i) {
    //     System.out.println(i);
    //     if(i>1){
    //         print(i-1);
    //     } else {
    //         return;
    //     }
        
    // }
    public static int factorial(int number){
        if(number == 0 || number ==1) {
            return 1;
        } else {
            return number * factorial(number-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
