package code.day23;

public class C6StaticInstance {

    public static void main(String[] args) {

        new Apple() .eatApple();

        //anonymous objects become unreachable after they are created
        new Apple() . eatApple();


        //a1 is the reference variable or reference or instance
        Apple a1 = new Apple() ;
        a1.eatApple();

        System.out.println(a1);
        System.out.println( Apple.getNumber() );

        System.out.println("No. of apple objects:" + Apple.appleCount);

    }

}

class Apple{

    static int appleCount ;
    void eatApple(){
        System.out.println("Eating apple");
    }

    //constructor is called everytime when the object is created
    //So, if we count how many times the constructor is called, we can count how many objects are created
    Apple(){
        appleCount++;
    }

    static int getNumber(){
        return 5;
    }
}
