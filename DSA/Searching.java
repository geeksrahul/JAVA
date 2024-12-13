public class Searching {
    public static int linearSearch(int[] array, int searchElement) {
        int count = 0;
        int ans = 0;
        for(int i=0; i<array.length; i++) {
            count++;
            if( array[i] == searchElement) {
                ans = i;
                break;
            }
        }
        System.out.println("count : " + count);
        return ans;
    }
    public static int binarySearch(int[] array, int searchElement) {
        int ans = 0;
        int count = 0;
        int min = 0;
        int max = array.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max)/2;
            count++;
            if( array[mid] == searchElement) {
                ans = mid; 
                break;
            } else if (array[mid] > searchElement) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println("count : " + count);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println(linearSearch(arr, 4));
        System.out.println(binarySearch(arr, 4));
    }
}
