public class Mammal extends Animal {
    private int age;
    private String furType;

    public Mammal(String name, int age, String furType) {
        super(name);
        this.age = age;
        this.furType = furType;
    }

    @Override
    public void speak(){
        System.out.println(name + " speaking. Age: "+age);
    }
}
