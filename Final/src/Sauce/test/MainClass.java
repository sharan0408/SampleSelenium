package Sauce.test;

public class MainClass {

    public static void main (String[] args){

        if(args.length == 0)
        {
            System.out.println("No arguments found");

        }
        if (args[0].equals("test1"))
        {
            LoginPage lp = new LoginPage();
            System.out.println("Executing Test case of Login Page");
            lp.login();
        }
        if (args[1].equals("test2"))
        {
            WrongCredentials wc = new WrongCredentials();
            System.out.println("Executing Test case of Problem User");
            wc.wrongCred();
        }
        if (args[2].equals("test3"))
        {
            ProblemUser pu = new ProblemUser();
            System.out.println("Executing Test case of Wrong Credentials");
            pu.problemUser();
        }
        if (args[3].equals("test4"))
        {
            AddCart ac = new AddCart();
            System.out.println("Executing Test case of Add Cart");
            ac.addCart();
        }
    }
}
