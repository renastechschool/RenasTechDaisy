package code.day15;

import java.util.Scanner;

public class C3Equals {
    public static void main(String[] args) {

        String str = "slav";
        Scanner scan = new Scanner(System.in);
       /* System.out.println( str . equals("Slav"));
        System.out.println(str . equals("SlAV"));
        System.out.println(str . equalsIgnoreCase("SlaV"));
        */
        /*
        WAP to validate username and password
         */
        String username = "proCoder";
        String password = "juT7%$";
        System.out.println("Enter Username:");
        String uName = scan.next();
        System.out.println("Enter password:");
        String pass = scan.next();

        if (uName.equalsIgnoreCase(username) && pass.equals(password)) {
            System.out.println("Login succesful");
        } else {
            System.out.println("Login unsucessful");
        }

    }
}
