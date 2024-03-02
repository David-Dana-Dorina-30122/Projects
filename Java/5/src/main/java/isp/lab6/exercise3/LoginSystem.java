package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem() {
        users = new HashSet<>();
        store = new OnlineStore();
    }

    public void register(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
        store.addSession(username);
        System.out.println("User registered successfully!");
    }

    public boolean login(String username, String password) {
        User user = findUser(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public boolean logout(String username) {
        if (store.removeSession(username)) {
            System.out.println("Logout successful!");
            return true;
        } else {
            System.out.println("User session not found.");
            return false;
        }
    }
    private User findUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
