package code.codereview.CodeReview26thJan;

public class StaticBinding {
    public static void main(String[] args) {

        /*
        Static Binding OR Early Binding
        Output Explanation: As you can see, in both cases the show method of the
        superclass is called. Let us discuss how this happens

    We have created one object of subclass and one object of the superclass with
    the reference of the superclass.
    Since the show method of the superclass is static, the compiler knows that it
    will not be overridden in subclasses (as method overriding is not applicable for static methods)
     and hence compiler knows during compile time which show method to call and hence no ambiguity.

     So, in this case show method is not bound with any object , it is bound with type of the reference
     used to call it. It is because static members are not bound or associated with the objects rather
     they are bound with the type of the reference using which they are called.
         */
        Base b = new Child() ; b . show() ; // Base.show() ;
        Base b1 = new Base();  b1 . show() ; // Base.show() ;
        Base.show() ;

        //Here, the type of the object is Child. So, the static show method of Child is called.
        //As,this show method is associated with the type Child.
        new Child() . show() ; // Child.show() ;
        Child c = new Child() ; c.show() ; // Child.show() ;
        Child.show() ;
    }
}


class Base{
    static void show(){
        System.out.println("Hello");
    }
}

class Child extends Base{
    static void show(){
        System.out.println("Hi");
    }
}