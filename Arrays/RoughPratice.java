import java.util.Arrays;
public class RoughPratice {

    public static void insertion(int[] arr) {
        int size = arr.length;
        int index = 1;
        int value = 500;

        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[index] = value;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void deletion(int[] arr) {
        int size = arr.length;
        int index = 2;
        
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void linearSearch(int[] arr, int target) {
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static void binarySearch(int[] arr, int target) {
        
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        deletion(arr);
        linearSearch(arr, 50);
        binarySearch(arr, 40);
    }
}
