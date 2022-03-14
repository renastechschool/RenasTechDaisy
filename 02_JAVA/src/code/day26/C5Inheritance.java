package code.day26;


//super refers to the members of the super class


public class C5Inheritance {


    public static void main(String[] args) {
        Child1 c = new Child1();
        //c.show() ;
        //super and this keyword are not allowed in the static methods
        //super. show() ;
        c.showA();
    }
}

class Base1{
    int a = 10;
    //overridden
    void show(){  System.out.println("Hello");  }
}

class Child1 extends Base1{
    int a = 20 ;
    void showA(){
        int a=30;

        //Data Shadowing OR local variable Data Hiding
        // : when a local variable hides the instance variable
        System.out.println(a);//local variable a


        System.out.println(this.a);// accessses the instance variable a
        System.out.println(super.a);// super class's a variable
    }

    //overriding OR override
    void show(){ System.out.println("Hi"); super.show() ; }



}