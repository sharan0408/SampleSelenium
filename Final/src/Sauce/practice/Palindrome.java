package Sauce.practice;


import javax.swing.text.AttributeSet;

public class Palindrome {

    public static void main(String[] args) {

        String name = "MADAM";
        String k = "";

        for(int i = name.length()-1; i>=0 ; i--)
        {

            k = k+ name.charAt(i);
        }

        System.out.println(k);

        if(name.equals(k))
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }
}
