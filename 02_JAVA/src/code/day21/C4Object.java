package code.day21;

public class C4Object {

    //non-static or instance variable
    //or attribute or instance data member or instance data field or instance data
    //non-static data or object data or data inside the object
    //an instance variable is associated with the object
    //an instance variable represents the property or state of the object
    int j = 50;



    //static variable or static data member or static field
    //a static varibale is not associated with the object
    static String name = "Tom" ;



    public static void main(String[] args) {
        /*
        instance can mean an object
        instance can also mean a non-static thing
        instance things(methods and variables ar associated with the instance or object)
         */


        //a local variable takes memory inside the stack area
        int c=1;
    }

    //a static method is not associated with the object
    static void show(){
        System.out.println();
    }


    //non-static or instance method is associated with the instance
    //a non-static or an instance method represents the behaviour
    //or functionality of the object
    //also called an instance member function
    void play(){}
}
