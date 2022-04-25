package study;

public class lab7 {

    public static void main(String[] args) {
        int num= 363147;
        int rev= 0;

        while(num>0){

            rev= rev*10+ num%10;
            num=num/10;

        }
        System.out.println(rev);
    }
}
