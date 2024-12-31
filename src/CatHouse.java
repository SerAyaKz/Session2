public class CatHouse { //example of Composition
    private Cat cat;

    public CatHouse(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void showDetails(){
        if(cat != null){
            System.out.println(cat.toString());
        } else{
            System.out.println("No cat");
        }
    }
}
