package Task1;

public class Main {
    public static void main(String[] args) {

        HotDrink latte = new HotDrink("Латте", 0.5, 60, 150);
        HotDrink greentea = new HotDrink("Зеленый чай", 0.3, 70, 80);
        HotDrink raf = new HotDrink("Апельсиновый Раф", 0.5, 65, 190);
        HotDrinksProductMachine hotDrProdMac = new HotDrinksProductMachine();
        hotDrProdMac.addHotDrinks(latte);
        hotDrProdMac.addHotDrinks(greentea);
        hotDrProdMac.addHotDrinks(raf);

        System.out.println(hotDrProdMac.geHotDrinks());

        hotDrProdMac.shopHotDrinks();

    }
}
