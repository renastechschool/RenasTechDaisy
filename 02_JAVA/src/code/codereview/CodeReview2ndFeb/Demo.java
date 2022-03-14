package code.codereview.CodeReview2ndFeb;
public class Demo {
    //public  - access modifier/ access specifier
    //static -  modifier / non-access modifier
    //void  - return type
    //main - method name
    //String[] - argument list
    public static void main(String[] args) {
        new Test() ;
        //Test . main( new String[] {"Sara", "Aslan"} );
    }

    //access modifier - default
    //return type - void
    //method name - show
    void show() {  }

    void show(int i)  {}

    int show(String s){ return 10 ; }
    //above three show methods are the overloaded methods
    //because the method names is same but the argument list is different
    //NOTE: return type has no role to play in method overloading
}


//The Test class does not have a main method. So it cannot be run directly but
//it can be used through some other class's code
class Test{   /*public static void main(String[] args) {  System.out.println("Hello");  }*/
    static {  System.out.println("Apple");  }
}