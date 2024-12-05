package Array;
import java.util.Scanner;
public class B_ArrayProblem {
    public static Scanner sc = new Scanner(System.in);
    // input array
    public static void inputArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.printf("Enter Element-%d : ",i); 
            array[i] = sc.nextInt(); // modifying original array directly
        }
    }
    // print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %d ", array[i]);
        }
        System.out.println();
    }
    // method to find sum of array
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    // method to find average of array
    public static float avgOfArray(int[] array) {
        float average = (float) sumOfArray(array) / array.length;
        return average;
    }
    // reverse array
    public static void reverseArray(int[] array){
        int temp;
        for(int i=0,j=array.length - 1; i<j; i++,j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    // find maximum element
    public static int getMaximum(int[] array) {
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    // find minimum element
    public static int getMinimum(int[] array) {
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    // linear search in array
    public static int search(int[] array, int search) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == search) {
                return i;
            }
        }
        return -1;
    }
    // count occurence 
    public static int countOccurence(int[] array, int search) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == search) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter Length Of Array : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        inputArray(arr);
        printArray(arr);
        // System.out.println("sum of array : " + sumOfArray(arr));
        // System.out.println("avg of array : " + avgOfArray(arr));
        // reverseArray(arr);
        // printArray(arr);
        // System.out.println("max of array : " + getMaximum(arr));
        // System.out.println("index of array element : " + search(arr,7));
        System.out.println(countOccurence(arr, 7));
    }
}
