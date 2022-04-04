package students.Kadir;
//    Write a method that can return
//the sum of the digits in a string

public class Lab05 {
    public static void main(String[] args) {
        String str="ABC456DE7";
        int sum=0;
        char[] ch=str.toCharArray();
        for (int i =0 ; i< ch.length ; i++) {
            if (Character.isDigit(ch[i])){
                sum +=Integer.parseInt("" + ch[i]);
            }
        }
        System.out.println(sum);




    }
}
