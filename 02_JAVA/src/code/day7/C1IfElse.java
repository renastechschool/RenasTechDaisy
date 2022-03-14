package code.day7;

public class C1IfElse {

    public static void main(String[]ap){

        /*

       -WAP to print the greater of the two given numbers
        -WAP to print the smaller of the two given numbers

       -WAP to print the greatest of the three given numbers
        -WAP to print the smallest of the three given numbers
        * */

        int a=100,b=20,c=30;

        if(a<b && a<c)  System.out.println(a + " is smallest");

        else if(b<a && b<c) System.out.println(b + " is smallest");

        else System.out.println(c + " is smallest");

    }
}
