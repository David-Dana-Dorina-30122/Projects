package aut.isp.lab4.exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pHMonitoring monitoring = new pHMonitoring();

        System.out.println("Current ph: ");
        int level = scanner.nextInt();
        monitoring.setpHLevel(level);

        monitoring.pHController(monitoring.getpHLevel());

    }
}
