package code.studyhalls.st27_01_2022;

public class PolyUpcasting {

    public static void main(String[] args) {
        Animal a1 = new Dog() ; a1.makeNoise();
        Animal a2 = new Cat() ; a2.makeNoise();
        Animal a3 = new Lion();  a3.makeNoise();
    }
}

abstract class Animal{  abstract  void makeNoise()  ;  }

class Dog extends Animal{
    void makeNoise() {  System.out.println("Ruff ruff!!");  }
}

class Cat extends Animal{
    void makeNoise() {  System.out.println("Meow Meow!!");  }
}

class Lion extends Animal{
    void makeNoise() { System.out.println("Roarr!!"); }
}

