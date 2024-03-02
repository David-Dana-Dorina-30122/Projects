package isp.lab7.safehome;


import java.util.Scanner;

public class SafeHome {

    public static void main(String[] args) throws TenantAlreadyExistsException, TenantNotFoundException, TooManyAttemptsException, InvalidPinException {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Enter who is logging in(Admin/Tenant)");
        DoorLockController obj = new DoorLockController();
        while(choice != 3) {
            System.out.println("1.Admin");
            System.out.println("2.Tenant");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Logged as Admin");
                    System.out.println("Choose an action: ");
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1.Add Tenant");
                        System.out.println("2.Remove Tenant");
                        System.out.println("3.View AccessLog");
                        System.out.println("4.Exit");
                        choice2 = scanner.nextInt();

                        switch (choice2) {
                            case 1:
                                String name, pin;
                                System.out.println("Enter the name: ");
                                name = scanner.next();
                                System.out.println("Enter the pin: ");
                                pin = scanner.next();
                                obj.addTenant(name, pin);
                                break;
                            case 2:
                                System.out.println("Enter the name: ");
                                name = scanner.next();
                                obj.removeTenant(name);
                                break;
                            case 3:
                                System.out.println("pt nr 3 urmeaza ");
                                break;

                            case 4:
                                System.out.println("Exiting..");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Logged as Tenant");
                    int choice3 = 0;
                    while (choice3 != 3) {
                        System.out.println("1.Open the door");
                        System.out.println("2.Close the door");
                        System.out.println("3.Exit");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("Enter pin to open: ");
                                String pin = scanner.next();
                                obj.enterPin(pin);
                                System.out.println(obj.enterPin(pin));
                                break;
                            case 2:
                                System.out.println("Enter pin to close: ");
                                pin = scanner.next();
                                obj.enterPin(pin);
                                System.out.println(obj.enterPin(pin));
                                break;
                            case 3:
                                System.out.println("Exiting..");
                                break;
                        }
                    }
                    break;
            }
        }

    }
}
