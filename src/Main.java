public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        animal.speak();

        Mammal mammal = new Mammal("Mammal", 12,"fine");
        mammal.speak();

        Cat cat = new Cat("Kitty", 18,"Short hair", "Scotland's cat");
        cat.speak();
        cat.showBreed();

        CatHouse catHouse = new CatHouse(cat);
        catHouse.showDetails();

        Owner owner = new Owner("Alice", cat);
        owner.showOwnerInfo();
        owner.releaseCat();
//        Owner owner1 = new Owner("Bob", cat);
//        owner1.showOwnerInfo();
//        owner1.releaseCat();
        cat.speak();

    }
}