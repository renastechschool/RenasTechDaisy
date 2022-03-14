package code.day7;

public class C3NestedIf {
//You're a tour manager and need a program that will identify small countries.
//A country is considered small if its population is under 10000
// and its area is under 10000 hectares.
//The given program takes population and area as input.
//Task
//Complete the program to output "small country" if both conditions are met.


    public static void main(String[]dl){
        int population=565451, area=55697;
        if(population<10000){

            if(area<10000){
                System.out.println("Small country");
            }
            else
                System.out.println("population is less than 10000 but" +
                        "\narea is greater than 10000");

        }
        else{
            if(area<10000){
                System.out.println("population is greater than 10000\n" +
                        " but area is less than 10000");
            }
            else
                System.out.println("population is greater than 10000\n" +
                        " and area is also greater than 10000");

        }

    }

}
