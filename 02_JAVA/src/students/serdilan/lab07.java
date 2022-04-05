package students.serdilan;

public class lab07 {
    //    Write a return method that can reverse number and return it as int
    public static void main(String[] args) {
    int number=4567;
        System.out.println(reverseNumber(number));
    }
    public static int reverseNumber(int num){
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
