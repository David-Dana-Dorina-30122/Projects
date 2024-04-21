package isp.lab6.exercise2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        List<Vehicle> vehicle = new ArrayList<>();
        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Add a vehicle to the list");
            System.out.println("2. Remove a vehicle from the list using the VIN");
            System.out.println("3. Check if a vehicle with the same VIN is in the list");
            System.out.println("4. Display the list of vehicles in the list");
            System.out.println("5. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the VIN: ");
                    String vin = scanner.nextLine();
                    System.out.print("Enter the license plate: ");
                    String licensePlate = scanner.nextLine();
                    System.out.print("Enter the make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter the model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Vehicle newVehicle = new Vehicle(vin,licensePlate,make,model,year);

                    break;
                case 2:
                    System.out.print("Enter the VIN of the vehicle to remove: ");
                    vin = scanner.nextLine();
                    Vehicle veh = new Vehicle(vin);
                    if (vehicle.remove(veh)) {
                        System.out.println("Vehicle removed from the list.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the VIN of the vehicle to check: ");
                    vin = scanner.nextLine();
                    Vehicle veh1 = new Vehicle(vin);
                    if (vehicle.contains(veh1)) {
                        System.out.println("Vehicle with the same vin exists in the list.");
                    }

                    break;
                case 4:
                    System.out.println("List of vehicles in the list:");
                    for (Vehicle v : vehicle) {
                        System.out.println(v.toString());
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}

