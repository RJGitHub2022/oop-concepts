package zoo;

//import interfaces.ICommunication;

import interfaces.ICommunication;

public class Animal implements ICommunication {


    //Inheritance
    Animal duck = new Duck(50, "Fllapper", "Donald");

//test


    //Fields
    private int age;
    private String gender;
    private String name;

    //Constructors
    //Method overloading - when you have the same method name different paramenter
    //Method overriding - when you have the same method name different out
    public Animal(){

    }
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //Getters and Setters

    public int getAge() {
        return age;
    }
    public String getAge(String name){
        return " Your name is: " + name + "My age is: " + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Methods
    public  boolean isMammal(){
        return  true;
    }
    public String swim(){
        return "I am swimmming";
    }
    public String run(){
        return "I am a running man";
    }
    //To String

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String speak() {
        return null;
    }
}
