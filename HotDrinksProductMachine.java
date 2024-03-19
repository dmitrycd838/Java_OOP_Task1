package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinksProductMachine implements ProductMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinksProductMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> geHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Автомат принял деньги");
    }

    @Override
    public void productDelivery() {
        System.out.println("Автомат выдал горячий напиток");
    }

    @Override
    public void change() {
        System.out.println("Автомат выдал сдачу");
    }

    public void shopHotDrinks() {

        Scanner scn = new Scanner(System.in);
        System.out.println("\nВыберите горячий напиток");
        for (HotDrink hotDrink2 : hotDrinks) {
            System.out.println(hotDrink2.getName() + " ");
        }

        System.out.println("\nПоле для ввода: ");
        String inputHotDrink = scn.nextLine();
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(inputHotDrink)) {
                System.out.println("Оплатить = " + hotDrink.getPrice());
                System.out.println("Внесение суммы: ");
                String enterMoney = scn.nextLine();
                int intMoney = Integer.parseInt(enterMoney);
                if (intMoney >= hotDrink.getPrice()) {
                    acceptingMoney();
                    productDelivery();
                    System.out.println(hotDrink);
                    int change = intMoney - hotDrink.getPrice();
                    change();
                    System.out.println("Сдача = " + change);
                } else {
                    acceptingMoney();
                    System.out.println("Недостаточно средств");
                }
            }
        }
        scn.close();
    }
}
