package isp.lab6.exercise3;

import java.util.*;

public class OnlineStore {
    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore() {
        products = new ArrayList<>();
        sessions = new HashMap<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(sortCriteria);
        return sortedProducts;
    }

    public void addSession(String username) {
        ActiveSession session = new ActiveSession(username);
        sessions.put(username, session);
    }

    public boolean removeSession(String username) {
        if (sessions.containsKey(username)) {
            sessions.remove(username);
            return true;
        }
        return false;
    }

    public void addToCart(String username, Product product, int quantity) {
        if (sessions.containsKey(username)) {
            ActiveSession session = sessions.get(username);
            session.addToCart(product, quantity);
            System.out.println("Product added to cart successfully!");
        } else {
            System.out.println("User session not found.");
        }
    }

    public String checkout(String username) {
        if (sessions.containsKey(username)) {
            ActiveSession session = sessions.get(username);
            String orderDetails = session.checkout();
            System.out.println("Checkout successful!");
            return orderDetails;
        } else {
            System.out.println("User session not found.");
            return null;
        }
    }
}
