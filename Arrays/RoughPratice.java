public class RoughPratice {

    public static void insertion(int[] arr) {
        int size = 5;
        int index = 1;
        int value = 500;

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[index] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void deletion(int[] arr){
        int size = 5;
        int index = 2;
        
        for(int i = index; i < size; i++){
            arr[i] = arr[i + 1];
        }
        
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        insertion(arr);
        deletion(arr);
    }
}
