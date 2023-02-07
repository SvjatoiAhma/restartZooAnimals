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


        for(ZooAnimals o:listZoo){
            if(o != null) {
                o.voice();
            }
        }

    }
}
