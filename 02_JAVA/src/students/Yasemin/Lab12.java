package students.Yasemin;

public class Lab12 {

//instance variables

    String type;
    String name;
    double age;
    String color;

    Lab12(String type, String name, int age, String color) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.color = color;

    }

    // static block to print type of the animal first
    static {
        System.out.println("Animal's type is dog");
    }


    // function methods
    void run() {
        System.out.println("Bodur is so fast");
    }

    void eat() {
        System.out.println("Bodur likes meat");
    }

    void play() {
        System.out.println("Bodur likes play");
    }

    //to print our objects we will need to create a toString method


    public String Dog() {

        return "My animal is a " + type + " his name is " + name + " and " + age + " years old ";
    }


    public static void main(String[] args) {

        Lab12 bodur1 = new Lab12("Dog", "Bodur", 3, "Black ");

        System.out.println(bodur1.Dog());
        System.out.println("his habits");

        bodur1.run();
        bodur1.eat();
        bodur1.play();

    }

}


