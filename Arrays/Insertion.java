public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int size = 5;
        int index = 1;
        int value = 2;

        for (int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
