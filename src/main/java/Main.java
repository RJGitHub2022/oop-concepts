import zoo.Animal;
import zoo.Fish;

import java.security.Signature;

public class Main {
    public static void main(String[] args) {

        //Overloading Method
    /*Animal bear = new Animal();
    bear.setName("Bear";
    bear.SetAge(50);
    System.out.println(bera.getAge());
    System.out.println(bera.getAge("Addam")); */


        //Naming Convention
        //projects name -name  ||  name
        //packages lowerecase
        //classes UpperCAmelCAse
        //fields camelCase
        //methods camCase

        ///Overloading
        Animal bear = new Animal();
        bear.setName("This is a String Bear");
        bear.setAge(45);
        System.out.println(bear.getAge());
        System.out.println(bear.getAge("Adam"));

        System.out.println("\n\n");

        //Object 1
        Person adam = new Person();n
        System.out.println("Object 1");
        System.out.println(adam);
        ///set some state
        adam.setFirstName("Adam");
        adam.setLastName("Ingram");
        adam.setAge(41);
        System.out.println("First Name" + adam.getFirstName() +
                            "Last Name" +  adam.getLastName() +
                            "Age " + adam.getAge());

        //Object 2
        Person lindsay = new Person("Lindsay", "Ingram", 25);
        System.out.println("\nObject 2");
        System.out.println(lindsay);
        System.out.println(lindsay.getFirstName() + " is my wife");

        //Object 3
        Person person03 = new Person("Bob", "Smith", 34);
        System.out.println("\nObject 3");
        System.out.println(person03);
        System.out.println(person03.getFirstName() + " this is another person");

        //Fish 1
        Fish fish1 = new Fish();
        fish1.setAge(2);
        fish1.setAge(4);
        System.out.println("Fish 1: " + fish1.getName() + "Age " + fish1.getAge());
        System.out.println(fish1);
        //Fish 2
        Fish fish2 = new Fish(25, true);
        fish2.setName("Mickey");
        System.out.println(fish2);
        //Fish 3
        Fish fish3 = new Fish(3, "male","Flapper",25,true);
        fish3.setName("Nemo");
        System.out.println(fish3);


    }
}
