package Task1;

public class HotDrink extends Product {

    int temperature;
    int price;

    public HotDrink(String name, double volume, int temperature, int price) {
        super(name, volume);
        this.temperature = temperature;
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n\nТовар = " + super.getName() + "\nОбъём = " + super.getVolume() + "\nТемпература = " + temperature + "\nЦена = " + price ;
    }

}
