package code.day27;

public class Test {
    public static void main(String[] args) {
        My m = new Foo()  ;
        Tempo t = (Tempo)m;//downcasting
        Foo f  = (Foo) t  ;//downcasting
    }
}


interface My{}

abstract class Tempo implements My{}

class Foo extends Tempo{}

