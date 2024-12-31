public class Animal { // cosmic superclass
    protected String name;

    public Animal(String name) { // superclass constructor
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name+ " speaking.");
    }


}
