package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.Collection;

public class StartPoint {
    public static void main(String[] args) {
        Collection<ZooAnimal> listZoo = new ArrayList();
        listZoo.add(null);
        listZoo.add(new Cat());
        listZoo.add(new Dog());
        listZoo.add(new Wolf());
        listZoo.add(new Fox());
        listZoo.add(new Hamster());
        ZooAnimal cat = new Cat();
        ZooAnimal dog = new Dog();

        System.out.println("Размер списка " + listZoo.size());

        for(ZooAnimal o:listZoo){
            if(o != null) {
                o.voice();
            }
        }
        boolean catIsDog = cat.equals(dog);
        System.out.println(catIsDog);

        Collection listZoo2 = new ArrayList();
        listZoo2.addAll(listZoo);
        listZoo2.remove(" ");

        for(Object o:listZoo2) {
            System.out.println("Новый список " + o);
        }
    }
}
