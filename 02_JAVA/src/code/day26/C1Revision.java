package code.day26;

public class C1Revision {

    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        m.show();
    }
}

class Car{
    int i=10;
    //overridden method
    void show(){
        System.out.println("Hello");
    }
}


class Mercedes extends Car{
    //overriding OR override method
    void show(){
        System.out.println("Hi");
    }
}
