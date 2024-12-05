package Array;
import java.util.Scanner;
public class Array1D {
    static Scanner sc = new Scanner(System.in);
    // to create array
    public static int[] createArray(int length) {
        return new int[length];
    }
    // to input array
    public static void inputArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.printf("Enter Element-%d : ",i); 
            array[i] = sc.nextInt(); // modifying original array directly
        }
    }
    // to display array
    public static void displayArray(int[] array){
        for(int element:array) {
            System.out.println("Element : "+element); 
        }
    }
    // to check index of specific element
    public static int search(int[] array,int search) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == search) {
                return i;
            }
        }
        return -1;
    }
    //  to check specific element exist in array or not
    public static boolean contain(int[] array, int search) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == search) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7};
        System.out.println(contain(arr, 1));
        System.out.println(contain(arr, 2));
        System.out.println(contain(arr, 3));
        System.out.println(contain(arr, 4));
        System.out.println(contain(arr,51));
    }
}
