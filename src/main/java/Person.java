//user defined blueprint
public class Person {
    //Fields
    private String firstName;
    private String lastName;
    private int age;

    //Default Constructor
    //If one is not created by you , you get one by default

    public Person() {
    }


    //Parametrized Constructor
    //Method overloading is when you have the same name of a methoed with different paramenters

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //To String

    @Override
    public String toString() {
       /* return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';*/
        return  "My name  is" + getFirstName();
    }
}
