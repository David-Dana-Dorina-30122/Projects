package isp.lab6.exercise3;

import java.util.Scanner;

public class UserInterface {

    private LoginSystem loginSystem;
    private OnlineStore store;

    public UserInterface() {
        loginSystem = new LoginSystem();
        this.store = store;
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice < 4) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    loginSystem.register(username, password);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    loginSystem.login(loginUsername, loginPassword);
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    String logoutUsername = scanner.nextLine();
                    loginSystem.logout(logoutUsername);
                    break;
                case 4:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }
}
