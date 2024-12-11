public class p23_Random {
    public static int getRandom(int max){
        int random = (int) (Math.random()*max) + 1;
        return random;
    }
    public static void main(String[] args) {
        System.out.println("Random : "+getRandom(10));
    }
}
