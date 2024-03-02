package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession {

    private String username;
    private Map<Product, Integer> shoppingCart;

    public ActiveSession(String username) {
        this.username = username;
        shoppingCart = new HashMap<>();
    }

    public void addToCart(Product product, int quantity) {
        if (shoppingCart.containsKey(product)) {
            int currentQuantity = shoppingCart.get(product);
            shoppingCart.put(product, currentQuantity + quantity);
        } else {
            shoppingCart.put(product, quantity);
        }
    }

    public String checkout() {
        StringBuilder orderDetails = new StringBuilder();
        double totalAmount = 0.0;

        orderDetails.append("Order Details:\n");
        orderDetails.append("Username: ").append(username).append("\n");

        for (Map.Entry<Product, Integer> entry : shoppingCart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double itemAmount = product.getPrice() * quantity;

            orderDetails.append("Product: ").append(product.getName()).append(", ");
            orderDetails.append("Quantity: ").append(quantity).append(", ");
            orderDetails.append("Price: $").append(product.getPrice()).append(", ");
            orderDetails.append("Total: $").append(itemAmount).append("\n");

            totalAmount += itemAmount;
        }
        orderDetails.append("Total Amount: $").append(totalAmount).append("\n");
        shoppingCart.clear();
        return orderDetails.toString();
    }
}
