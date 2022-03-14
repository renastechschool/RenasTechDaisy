package code.studyhalls.st14_01_2022;

public class Temp {

    int i=10; int j=20;

    static Temp t = new Temp();

    {
        System.out.println(j);
        System.out.println(i);
    }

    Temp(){
        System.out.println(j);
        System.out.println(i);
    }


    static{    System.out.println("Hi");  }
    public static void main(String[] args) {

    }
}
