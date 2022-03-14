package code.day25;

public class C6Inheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println(c.i + c.j + c.k) ;
    }

}


class Dede1{
    int i=5;
}

class Baba1 extends Dede1{
    int j=10;
}

class Child1 extends Baba1{
    int k=20;
}