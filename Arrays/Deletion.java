public class Deletion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int size = 5;
        int index = 2;

        for (int i = index; i < size; i++){
            arr[i] = arr[i + 1];
        }

        size--;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    
}
