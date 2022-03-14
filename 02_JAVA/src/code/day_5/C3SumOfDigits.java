package code.day_5;

public class C3SumOfDigits {

    public static void main(String[]ap){
        /*
		1234 sum_of_igits: 1+2+3+4=10
		1234/1000 = 1  % 10 = 1
		1234/100  = 12 % 10 = 2
		1234/10	  =123 % 10 = 3
		1234/1	  =1234% 10 = 4
	    */
        int n = 1234;

        int sum_of_digits = (n/1000)%10 + (n/100)%10 + (n/10)%10 + (n/1)%10 ;




        System.out.println(sum_of_digits);
    }
}
