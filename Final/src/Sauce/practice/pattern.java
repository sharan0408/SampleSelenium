package Sauce.practice;

public class pattern {

    public static void main(String[] args)
    {
        /*
        1
       2 3
       4 5 6
       7 8 9 10
         */
        int k = 1;
        for (int i= 1; i<=4; i++)
        {
            for(int j = 1; j <= i; j++ )
            {
                System.out.print(" " + k + " ");
                k++;
            }

            System.out.println("");
        }

        /*
        * * * *
          * * *
            * *
              *
         */

        for (int l = 0 ; l <= 4 ; l++)
        {
            for(int m = 1; m<= 4-l; m++)
            {
                System.out.print("**");
            }
            System.out.println("");
        }
    }
}
