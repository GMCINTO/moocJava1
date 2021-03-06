
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {

        Person comparedPerson = (Person) compared;
        if(compared == this){
            return true;
        }
     
        if (this.birthday.equals(comparedPerson.birthday)&&
                comparedPerson.name.equals(this.name) && 
                comparedPerson.height == this.height && 
                comparedPerson.weight == this.weight ){
            return true;
        }
        return false;
    }
    // implement an equals method here for checking the equality of objects
}
