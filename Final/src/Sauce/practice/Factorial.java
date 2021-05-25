package Sauce.practice;

public class Factorial {
    public static void main(String[] args) {

        int a =5;
        int factorial = 1;
        // 3 * 2 * 1  = 6

        for (int i = 1 ; i <= a ; i++ )
        {
            factorial = i * factorial;
        }
        System.out.println(factorial);
    }
}
