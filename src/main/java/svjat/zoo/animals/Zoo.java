package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.Collection;

public class Zoo {
    public Collection<AmphibianAnimal> getListAmphibian() {
        return listAmphibian;
    }

    public Collection<WildAnimal> getListWildAnimal() {
        return listWildAnimal;
    }

    private Collection<AmphibianAnimal> listAmphibian = new ArrayList();
    private Collection<WildAnimal> listWildAnimal = new ArrayList();

    public void addAnimal(ZooAnimal animal){
        if (animal instanceof AmphibianAnimal) {
            listAmphibian.add((AmphibianAnimal) animal);
        }
        if(animal instanceof WildAnimal){
            listWildAnimal.add((WildAnimal) animal);
        }
    }

    public String getInfo() {
        return "Full size = " + (listAmphibian.size() + listWildAnimal.size());
    }
}
