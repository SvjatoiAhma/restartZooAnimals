package svjat.zoo.animals;

 public class GenericZooStart {
     public static void main(String[] args) {
        GenericZoo<ZooAnimal> genericHomeAnimal = new GenericZoo<>();
        GenericZoo<Cat> genericZooCat = new GenericZoo<>();
        GenericZoo<Dog> genericZooDog = new GenericZoo<>();
        genericHomeAnimal.getList().addAll(genericZooDog.getList());
        genericHomeAnimal.getList().addAll(genericZooCat.getList());


    }
}
