public class Cat extends Mammal { //Indirect superclass
    private String breed;

    public Cat(String name, int age, String furType, String breed) {
        super(name, age, furType);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void speak() { // override
        System.out.println("Cat "+ name + " is speaking to its owner");
    }
    public void speak(String name1){ // overload
        // TO DO
    }

    public void showBreed() {
        System.out.println("Cat's breed is " + breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
