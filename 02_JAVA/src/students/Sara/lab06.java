package src.students.Sara;

public class lab06 {  //    Write a return method that returns the
  //  factorial number of any given number


    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;
            //res=res+i   -->sum

        }

        return result;}}

