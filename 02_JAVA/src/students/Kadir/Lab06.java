package students.Kadir;

//    Write a return method that returns the
 //          factorial number of any given number


public class Lab06 {
    public static void main(String[] args) {
        int num=6;
        int sum=1;
        for (int i=num ; i>0 ; i--){
           sum *=i;
        }
        System.out.println(sum);
    }
}
