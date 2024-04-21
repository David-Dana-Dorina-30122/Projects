package isp.lab4.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the time for charging(minutes): ");
        int duration = scanner.nextInt();

        Laptop laptop = new Laptop();
        laptop.charge(duration);
        laptop.getBatteryLevel();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.charge(duration);
        smartPhone.getBatteryLevel();

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.charge(duration);
        smartWatch.getBatteryLevel();

    }
}