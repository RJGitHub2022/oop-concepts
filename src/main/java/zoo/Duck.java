package zoo;

public class Duck extends Animal {
    //Field
    private static final String BEAKCOLOR = "Yellow";
    //Constructors

    public Duck(int age, String gender, String name) {
        super(age, gender, name);
    }


    //Getter and Setters

    //Methods
    public  String fly(){
        return " I am flying";
    }
    public  String quack(){
        return "I am quacking";
    }

    //Override Methods
    @Override
    public String swim() {
        return super.swim();
    }


    //To String
}
