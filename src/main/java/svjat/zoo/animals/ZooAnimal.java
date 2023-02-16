package svjat.zoo.animals;

public abstract class ZooAnimal implements Voice{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;
    @Override
    public int hashCode() {

        return (this.name != null)? name.hashCode(): super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        ZooAnimal an = ((ZooAnimal) obj);
        if (this.name != null && an.getName() != null) {
            return this.name.equals(an.getName());
        }
         return false;
    }

    @Override
    public abstract void voice();


}
