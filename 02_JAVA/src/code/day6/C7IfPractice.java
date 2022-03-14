package code.day6;

public class C7IfPractice {

    /*
        Points      Grades
        91 - 100    A
        75-90       B
        60-74       C
        40-59       D
        <40         E
    * */
    public static void main(String[]ap){

        int points = 95; char grade=' ';

        if(points>=91) grade='A';

        if(points>=75) grade='B';

        System.out.println(grade);
    }
}
