package code.day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c2_JavaFaker {

    @Test
    public void TC1_javaFaker(){
        //to be able to use librarry you need to create instance object from the class
        Faker faker=new Faker();
        System.out.println("faker.name().fullName()="+faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().character());
        System.out.println(faker.artist().name());

    }
}
