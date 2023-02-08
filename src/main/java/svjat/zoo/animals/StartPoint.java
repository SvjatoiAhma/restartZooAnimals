package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.Collection;

public class StartPoint {
    public static void main(String[] args) {
        Collection<ZooAnimals> listZoo = new ArrayList();
        listZoo.add(null);
        listZoo.add(new Cat());
        listZoo.add(new Dog());
        listZoo.add(new Wolf());
        listZoo.add(new Fox());
        listZoo.add(new Hamster());

        System.out.println("Размер списка " + listZoo.size());

        for(ZooAnimals o:listZoo){
            if(o != null) {
                o.voice();
            }
        }

    }
}
