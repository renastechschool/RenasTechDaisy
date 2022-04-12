package students.Mihrican;

public class Lab_05 {

    public static void main(String[] args) {

        String str="r9n4st6ech";
        int sumOfStr= sumOfDigits(str);
        System.out.println("sumOfStr = " + sumOfStr);
    }
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
