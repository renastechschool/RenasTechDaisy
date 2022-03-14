package code.day24;

public class C1Revision {

    static int count ;
    /*
    Constructor is a special method of a class.
    Its name is same as the class name
    It does not have a return type
    It is called alongside new operator at the time of
    object creation
    If we want to do a common task each time an object is created,
    we use constructor
     */
    C1Revision(){
        System.out.println("Object number " + ++count + " created...");
    }

    public static void main(String[] args) {

        System.out.println("count=" + count);
        new C1Revision();

        C1Revision c = new C1Revision();

        new C1Revision();

        System.out.println("count=" + count);
    }
}
