public class Mammal extends Animal {// direct superclass and subclass
    private int age;
    private String furType;

    public Mammal(String name, int age, String furType) {
        super(name); // call for superclass constructor
        this.age = age;
        this.furType = furType;
    }

    @Override
    public void speak(){ //override
        System.out.println(name + " speaking. Age: "+age);
    }
}
