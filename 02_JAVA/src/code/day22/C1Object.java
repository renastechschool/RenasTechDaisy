package code.day22;

public class C1Object {

    public static void main(String[] args) {

       Song s1 =  new Song() ;
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
        s1.setArtist("Shakira") ;
        s1.setTitle("Whenever Wherever!!");
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
    }
}

class Song{
    // instance data members and instance member functions are together called instance members

    String artist, title ;//state of the object or instance variable
    //behaviour of the object or instance methods
    void setArtist(String artist){ this.artist = artist ;  }
    String getArtist(){ return this.artist ;   }
    void setTitle(String title){ this.title = title ;   }
    String getTitle(){ return this.title ;}

}