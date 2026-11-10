public class Factorial{
    static int factorial(int value){
        if (value == 0){
            return 1;
        }
        return value * factorial(value - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}