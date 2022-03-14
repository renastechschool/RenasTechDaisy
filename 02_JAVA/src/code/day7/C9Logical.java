package code.day7;

public class C9Logical {
    //You're a tour manager and need a program that will identify small countries.
//A country is considered small if its population is under 10000
// and its area is under 10000 hectares.
//The given program takes population and area as input.
//Task
//Complete the program to output "small country" if both conditions are met.

    public static void main(String[]ap){

        int a = 1000000, p = 800;
        if (a<100000 && p<100000) System.out.println("small country");
        else if (a<100000 && p>100000) System.out.println("area small, population big");
        else if (a>100000 && p<100000) System.out.println("area big, population small");
        else if (a>100000 && p> 100000) System.out.println("big country");

    }

}
