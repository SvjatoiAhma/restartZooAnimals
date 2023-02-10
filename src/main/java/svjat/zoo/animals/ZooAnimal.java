package svjat.zoo.animals;

public abstract class ZooAnimal implements Voice{
    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        return this == obj;
    }

    @Override
    public abstract void voice();


}
