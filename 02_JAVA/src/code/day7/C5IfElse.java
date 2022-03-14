package code.day7;
public class C5IfElse {
    /*
        Points      Grades
        91 - 100    A
        75-90       B
        60-74       C
        40-59       D
        <40         E
    * */
    public static void main(String[]ap){
        //else block cannot exist without an if block
        //else if{} ERROR: else without if
        int points = 58;

        if(points>=91)  System.out.println('A');

        //checks points for the range of 75 to 91
        else if(points >= 75)   System.out.println('B');

        //checks points for the range of 60 to 74
        else if(points >= 60)   System.out.println('C');

        //checks points for the range of 40 to 59
        else if(points>=40)     System.out.println('D');

        else System.out.println('E');
    }
}
