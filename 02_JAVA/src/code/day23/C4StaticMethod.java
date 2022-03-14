package code.day23;

public class C4StaticMethod {

    public static void main(String[] args) {
        //Below is the anonymous object. When the reference of the object is not stored
        // in a variable, it is called an anonymous object
        new Demo() . play() ;

        Demo d = new Demo();  d . play();
    }
}

class Demo{

    static int a =10;

    static void show(){
        System.out.println("show");
        //play(); // error: a non-static method cannot be called directly from inside an static method
    }

    void play(){
        System.out.println("play");
        show();
    }
}
