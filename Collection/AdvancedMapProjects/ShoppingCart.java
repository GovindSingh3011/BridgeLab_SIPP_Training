import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 1.0);
        productPrices.put("Banana", 0.5);
        productPrices.put("Orange", 0.8);

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        cart.put("Banana", 0.5);
        cart.put("Apple", 1.0);
        cart.put("Orange", 0.8);

        TreeMap<Double, String> sortedCart = new TreeMap<>();
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedCart.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Cart Items in Order Added:");
        cart.forEach((k, v) -> System.out.println(k + ": $" + v));

        System.out.println("\nCart Items Sorted by Price:");
        sortedCart.forEach((v, k) -> System.out.println(k + ": $" + v));
    }
}