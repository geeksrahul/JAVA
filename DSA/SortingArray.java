import java.util.Scanner;
public class SortingArray {
    public static Scanner sc = new Scanner(System.in);
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
    public static void printArray(int[] array){
        for(int element:array) {
            System.out.printf(" %d ",element); 
        }
        System.out.println();
    }
    // Bubble Sort
    public static void bubbleSort(int[] array){
        int temp = 0;
        for(int i=0; i<array.length-1; i++)   {
            for(int j=0; j<array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Length Of Array : ");
        int len = sc.nextInt();
        int[] arr = createArray(len);
        inputArray(arr);
        printArray(arr);
        bubbleSort(arr);
        System.out.println("sorted array:");
        printArray(arr);
    }
}
