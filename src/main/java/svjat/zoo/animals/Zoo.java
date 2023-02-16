package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Zoo {
    public Collection<AmphibianAnimal> getListAmphibian() {
        return listAmphibian;
    }

    public Collection<WildAnimal> getListWildAnimal() {
        return listWildAnimal;
    }

    public Collection<HomeAnimal> getListHomedAnimal() {
        return listHomedAnimal;
    }

    private Collection<AmphibianAnimal> listAmphibian = new ArrayList();
    private Collection<WildAnimal> listWildAnimal = new ArrayList();
    private Collection<HomeAnimal> listHomedAnimal = new ArrayList();

    public void addAnimal(ZooAnimal animal) {
        if (animal instanceof AmphibianAnimal) {
            listAmphibian.add((AmphibianAnimal) animal);
        }
        if (animal instanceof WildAnimal) {
            listWildAnimal.add((WildAnimal) animal);
        }
        if (animal instanceof HomeAnimal) {
            listHomedAnimal.add((HomeAnimal) animal);
        }
    }


    public String getInfo() {
        return "Full size = " + (listAmphibian.size() + listWildAnimal.size());
    }

    public Collection<ZooAnimal> getAnimals() {
        Collection<ZooAnimal> animals = new HashSet();
        animals.addAll(listHomedAnimal);
        animals.addAll(listAmphibian);
        animals.addAll(listWildAnimal);
        return animals;
    }
}
