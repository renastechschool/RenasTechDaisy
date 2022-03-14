package code.codereview.CodeReview26thJan;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student s = new Student() ;
         //s . name = "Tom" ;  error: as name has a private access in  Student class
        s.setName("Tom");   s.setId(101);

        System.out.println(s.getName());
        System.out.println(s.getId());
    }
}

class Student{

    private int id;
    private String name ;

    public void setId(int id){  this.id = id ;  }
    public int getId(){  return this.id ;  }

    public void setName(String name){ this.name = name ;    }
    public String getName() {  return this.name ; }
}


