package students.Ahmet;

public class lab5 {
    ////    Write a method that can return
    //   the sum of the digits in a string

    public static void main(String[] args) {

        String str="r9n4st6ech";
        //           9+ 4 + 6= 10
        int sumOfStr= sumOfDigits(str);

        System.out.println("sumOfStr = " + sumOfStr);
    }
    /**
     *  Sum of the digits from a String.
     * @param str
     * @return sum of the numbers
     */
    public static int sumOfDigits(String str){
        int sum=0;

        char [] arr =str.toCharArray();

        for (char each: arr){

            if (Character.isDigit(each)){

                sum+=Integer.valueOf(""+each);
            }
        }
        return sum;
    }
}
