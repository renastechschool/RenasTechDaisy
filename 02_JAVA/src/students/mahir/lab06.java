package students.mahir;

public class lab06 {

    ////    Write a return method that returns the
    //     factorial number of any given number
    // 5 ? = 5 *4 *3*2 *1
    //4 ?=  1 *2 *3*4

    public static void main(String[] args) {

        System.out.println("factorialValue(5) = " + factorialValue(5)); // 1 *2*3 *4*5

    }

    /**
     *  Factorial value for given int
     * @param number
     * @return int factorial value
     */
    public static int factorialValue(int number){

        int answer=1;// I will use this variable to store my answer;

        int temp=1; // for temp.

        //     1 <= 5
        //     2<=5
        //    3<=5
        //     4<=5
        //    5<=5
        // when temp=6 <=5
        while (temp<=number){

            answer*=temp; // 1 *1 *2 * 3 * 4 *5

            temp++; //1 ++ > 2, 2++ > 3++ > 4 ++ > 5 ++ > 6?

        }

        return answer;

    }

}
