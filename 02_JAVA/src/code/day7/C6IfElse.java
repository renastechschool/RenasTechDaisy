package code.day7;
//if-else-if Ladder
public class C6IfElse {

    /*
    Age         Advice
    0-5         get Loved
    6-10        play
    11-20       study
    21-60       Work
    >60         Retire and Pray to God
    * */

    public static void main(String[]ap){

        int age= 25;

        if(age<=5)          System.out.println("Get Loved");
        else if(age<=10)    System.out.println("play");
        else if(age<=20)    System.out.println("study");
        else if(age<=60)    System.out.println("Work");
        else if(age>60)     System.out.println("Retire and pray to God");

    }
}
