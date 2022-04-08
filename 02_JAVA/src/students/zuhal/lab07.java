package src.students.zuhal;

public class lab07 {
    /*
## Lab 07 -  (Number) Reverse String and Number
             Write a return method that can reverse
             number and return it as int

    String s = "ida";
    String reverse = "";
    char ch[]= s.toCharArray();
    for(int i =s.length()-1; i>=0; i--){
        reverse += ch[i];
    }
    System.out.println(reverse);
       */
//       Write a return method that can reverse
//       number and return it as int
// example =>  123 expected > 321;

    public static void main(String[] args) {

        System.out.println("reverseInt( 54) = " + reverseInt(54)); //expected answer= 45
        System.out.println("reverseInt(6721) = " + reverseInt(6721)); // expected answer= 1276
    }

    public static int reverseInt(int number){
        int answer=0; // will use to store my answer;

        //    12 !=0
        //     1 !=0
        // 0 != 0 false
        while (number!=0){

            int lastDigit= number % 10; // 3 , 12 %10 == 2; 1 %10 =1;
            //    = 0 *10      +     3
            //     =  3  * 10 + 2
            //     = 32 *  10  + 1
            answer= answer *10 +lastDigit;  // 3 , 32 , 321

            number /=10; //  123 /10= > number= 12 , 12 /10 ==> 1 ,  1 /10 = 0;
        }
        return answer;

    }


}
