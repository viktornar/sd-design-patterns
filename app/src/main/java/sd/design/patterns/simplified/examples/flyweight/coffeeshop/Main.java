package sd.design.patterns.simplified.examples.flyweight.coffeeshop;

import java.util.ArrayList;
import java.util.WeakHashMap;

class CoffeeFlavour {
    private final String name;
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();

    // only cache() can call this constructor
    private CoffeeFlavour(String name) {
        this.name = name;
    }

    public static CoffeeFlavour cache(String name) {
        synchronized (CACHE) {
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

@FunctionalInterface
interface Order {
    void serve();

    static Order of(String flavourName, int tableNumber) {
        CoffeeFlavour flavour = CoffeeFlavour.cache(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}

class CoffeeShop {
    private final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableNumber) {
        orders.add(Order.of(flavour, tableNumber));
    }

    public void service() {
        orders.forEach(Order::serve);
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 897);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Frappe", 552);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);
        shop.service();
  }
}