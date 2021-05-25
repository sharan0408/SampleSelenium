package Sauce.practice;

import java.sql.SQLOutput;

public class Fibonacci {

    public static void main(String[] args) {

        int n1 = 1 ;
        int n2 = 1 ;
        int n3;
        int sum;

        System.out.print(n1 + "," + n2);
        for (int i = 0 ; i < 9 ; i++)
        {
            sum = n1 + n2 ;
            System.out.print(","+sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
