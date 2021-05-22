package Sauce.practice;

public class MinNoMatrix {
    public static void main (String [] args)
    {
        int a[][] = {{1,2,3},{4,5,0},{7,8,9}};
        int min = a[0][0];
        int k = 0;
        int col = 0;
        int max = a[0][0];

        for(int i = 0 ; i< 3 ; i++)
        {
            for(int j=0; j<3 ;j++)
            {
                System.out.print(a[i][j]);
                if (a[i][j]<min)
                {
                    min = a[i][j];
                    col = j;
                }
            }

            System.out.println("");

        }
        System.out.println(min + " is the min value in the matrix");
        System.out.println(col);

        while (k < 3)
        {
            if(a[k][col] > max)
            {
                max = a[k][col];
            }
            k++;
        }
        System.out.println(max + " is the max number in the min c=no colum");
    }
}
