public class p21_VarArgs {
    // public static int calculateSum(int num1, int num2) {
    //     int sum = num1 + num2;
    //     return sum;
    // }
    // public static int calculateSum(int num1, int num2,int num3) {
    //     int sum = num1 + num2 + num3;
    //     return sum;
    // }
    // public static int calculateSum(int num1, int num2,int num3, int num4) {
    //     int sum = num1 + num2 + num3 + num4;
    //     return sum;
    // }
    public static int calculateSum(int num1,int ...arr){
        int sum = num1;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void greet(String ...peoples) {
        for (String person : peoples) {
            System.out.println(person);
        }
    }
    public static void main(String[] args) {
        greet();
    }
}
