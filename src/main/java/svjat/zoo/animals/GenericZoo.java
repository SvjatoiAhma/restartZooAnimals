package svjat.zoo.animals;

import java.util.ArrayList;
import java.util.List;

 public class GenericZoo<E extends ZooAnimal>  {  // добавить extends
    List<E> list = new ArrayList<>();

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
