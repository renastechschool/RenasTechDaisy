package code.codereview.CodeReview19thJan;

public class ThisSuperDemo {

    public static void main(String[] args) {
        new Child();
    }


}


class Base{
    Base(){
        this(10);
        System.out.println("Hello");
    }
    Base(int a){ System.out.println(a) ; }
}

class Child extends Base{
    Child(){
        //super() ;
        System.out.println("Hi");
    }
}