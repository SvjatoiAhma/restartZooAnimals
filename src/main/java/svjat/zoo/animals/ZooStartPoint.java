package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.List;

public class ZooStartPoint {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        //  zoo.addAnimal(new Fox());
        Fox fox1 = new Fox();
        fox1.setName("Alisa");
        Fox fox2 = new Fox();
        fox2.setName("Musja");

        zoo.addAnimal(new Lizard());
        //  zoo.addAnimal(new Cat());

        Cat cat1 = new Cat();
        cat1.setName("Murzik");
        Cat cat2 = new Cat();
        cat2.setName("Murzik");
        Cat cat3 = new Cat();
        cat3.setName("Murzik");

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
        boolean cat1IsFox = (cat1.equals(fox1));
        boolean c = cat1IsCat2;
        boolean a = cat2IsCat3;

        System.out.println(c);
        System.out.println(a);


        boolean fox1IsFox2 = (fox1.equals(fox2));
        System.out.println(fox1IsFox2);

        System.out.println(cat1IsFox);

        List list = new ArrayList();
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        String text = list.get(0) + ", world!";
        System.out.print(text);

    }
}
