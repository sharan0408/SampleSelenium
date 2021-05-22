package Sauce.practice;

public class PrimeNo {
    public static void main(String[] args) {

        int a = 0;
        int k ;

        if(a == 0 || a ==1)
        {
            System.out.println("it is not prime number");
        }
        for(int i = 2; i<= a/2 ; i++)
        {
            if(a%i == 0)
            {
                System.out.println("it is not prime");
            }
            else
            {
                System.out.println("it is prime");
            }
        }

    }
}
