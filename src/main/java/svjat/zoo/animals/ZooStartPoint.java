package svjat.zoo.animals;

public class ZooStartPoint {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        //  zoo.addAnimal(new Fox()); //  убрали из списка Лису - в консоль пришло новое значение размера
        Fox fox = new Fox();

        zoo.addAnimal(new Lizard());
        //  zoo.addAnimal(new Cat());

        Cat cat1 = new Cat();
        cat1.setName("Murzik");
        Cat cat2 = new Cat();
        cat2.setName("Murzik");
        Cat cat3 = new Cat();
        cat3.setName("Murzik"); // если убрать имя, то переменная а даст false - так написан ХешКод

        zoo.addAnimal(cat1);
        zoo.addAnimal(cat2);

        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Hamster());

        System.out.println(zoo.getInfo() + " - from getInfo. And from size: " + (zoo.getListAmphibian().size() + zoo.getListWildAnimal().size() + zoo.getListHomedAnimal().size()));
        System.out.println(zoo.getAnimals().size());

        boolean cat1IsCat2 = (cat1.equals(cat2));
        boolean cat2IsCat3 = (cat2.equals(cat3));
        boolean cat3IsCat1 = (cat3.equals(cat1));
        boolean cat1IsCat1 = (cat1.equals(cat1));
        boolean cat1IsNull = cat1.equals(null);
        boolean cat1IsFox = (cat1.equals(fox));
        boolean c = cat1IsCat2;
        boolean a = cat2IsCat3;

        System.out.println(c);
        System.out.println(a);

    }
}
