package study;

public class lab5 {
    public static void main(String[] args) {
        String str = "asf7d8gg7dfa86sa5";
        char [] ch= str.toCharArray();

        int sum= 0;
         for (int i=0;i<ch.length;i++){
             if (Character.isDigit(ch[i])){
                 System.out.println("digits in the string "+ch[i]);
                 System.out.println();

                 int a =Integer.parseInt(String.valueOf(ch[i]));
                 sum=sum+a;
             }
         }
    }
}
