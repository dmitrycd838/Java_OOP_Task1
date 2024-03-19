package Task1;

public abstract class Product {

    private String name;
    private double volume;

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
