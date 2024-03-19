package Task1;

public abstract class Product {

    protected String name;
    protected double volume;

    public Product() {
    }

    public Product(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return name;
    }

    public double getVolume(){
        return volume;
    }

}
