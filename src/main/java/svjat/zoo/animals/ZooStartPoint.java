package svjat.zoo.animals;

public class ZooStartPoint {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Fox());
        zoo.addAnimal(new Lizard());
        System.out.println(zoo.getInfo() + " " + (zoo.getListAmphibian().size() + zoo.getListWildAnimal().size()));


    }
}
