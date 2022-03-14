package code.day31CollectionsList;

public class C5Wrapper {

    /*
    Corresponding to all the primitive types in Java,
    there are inbuilt classes called Wrapper classes.
    Primitive type          Wrapper class
    --------------          -------------
    byte                    Byte
    short                   Short
    int                     Integer
    long                    Long
    float                   Float
    double                  Double
    char                    Character
    boolean                 Boolean
                            Void  (practically never used)
     */
    public static void main(String[] args) {
        int i = 10 ;

        //Boxing or Wrapping
        Integer j = new Integer(10) ;

        //unboxing or unwrapping
        int k = j.intValue()   ;


        //autoboxing or auto wrapping
        Integer p = 20 ;

        //auto-unboxing or auto unwrapping
        int h = p ;

        //autoboxing
        Double d = 2.5  ;

        Boolean b = true ;
    }
}
