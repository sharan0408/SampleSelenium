package Sauce.practice;

import java.util.ArrayList;

public class NoOfWords {
    public static void main(String[] args) {

        String name = "Sharan   ";
        int count = 0;
        System.out.println(name.length());

        for (int i = 0; i< name.length() - 1 ; i ++)
        {
            if((name.charAt(i) == ' ') && (name.charAt(i+1) != ' '))
            {
                count++;
            }

        }
        System.out.println(count);

        int[] abc = {1,2,3,4};
        String nameee = "sharan";
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(abc.length);
        System.out.println(nameee.length());
        System.out.println(al.size());
    }
}
