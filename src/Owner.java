public class Owner { //example of Aggregation (Association)
    private String name;
    private Cat cat;

    public Owner(String name, Cat cat) {
        this.name = name;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void showOwnerInfo(){
        System.out.println(name + " owns a cat named " + cat.name);
    }

    public void releaseCat(){
        System.out.println("Cat "+ cat.name + " released");
        cat = null;
    }
}
