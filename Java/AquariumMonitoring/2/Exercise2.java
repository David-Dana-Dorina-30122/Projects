package aut.isp.lab4.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder feeder = new FishFeeder();

        System.out.println("Meals left: " + feeder.toString());

        for(int i = 1; i <= 12; i++){
            feeder.feed();
        }
        System.out.println("Meals left: " + feeder.toString());

        feeder.feed();
        feeder.feed();//we are left with no meals after the call, then it fills up

        System.out.println("Meals left: " + feeder.toString());
    }
}
