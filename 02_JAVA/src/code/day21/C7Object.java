package code.day21;

public class C7Object {


    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name ="Gulnaz";
        s1.age=25;
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student s2 = new Student();
        s2.name="Eren";
        //s2.age = 22 ;
        System.out.println( s2.getName());
        System.out.println(s2.getAge());

        Student s3 = new Student();
        //s3.name = "Kefo";
        s3.age = 30;
        System.out.println(s3.getName());
        System.out.println(s3.getAge());
    }



}


class Student{

    String name;
    byte age=5 ;

    void study(){
        System.out.println("student is studying..");
    }

    //accessor methods or getter methods
    String getName(){
        return name;
        //return this.name;
    }

    byte getAge(){
        return age;
        //return this.age;
    }
}
