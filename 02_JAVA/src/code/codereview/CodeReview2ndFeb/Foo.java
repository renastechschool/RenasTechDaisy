package code.codereview.CodeReview2ndFeb;
public class Foo {
    /*
    It is possible to overload the main method
    main method can also be overloaded just like any other method
     */

    static void   main(int i)   {  System.out.println("int args main"); }
    static double main(String s){ System.out.println(s);  return 5 ; }
    static void   main()        { System.out.println("no args main"); }

    //JVM will only call the main method with the below prototype
    /*public static void main(String[] args) {
        System.out.println("String array args main");
    }*/
}

class FooTester{
    public static void main(String[] args) {
        Foo.main("Apple");
    }
}
