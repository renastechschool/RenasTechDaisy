package code.day23;

public class C7InstanceStatic {

    public static void main(String[] args) {
        Foo.husky();
        System.out.println(Foo.bunny());
        new Foo() . meta();

        Foo f = new Foo();
        f.meta();

        System.out.println(
                Foo.add(5,10)
        );

    }
}


class Foo{

    static void husky(){
        System.out.println("gruff gruff!");
    }

    static String bunny(){
        return "Hello" ;
    }

    static double add(double a, double b){
        return a+b;
    }

    void meta(){
        System.out.println("Hi");
    }
}