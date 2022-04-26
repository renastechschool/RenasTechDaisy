package students.ikbal;

public class Lab007 {
    //    Write a return method that can reverse
   // number and return it as int
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
