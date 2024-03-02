package aut.isp.lab4.exercise4;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AquariumController3 o1 = new AquariumController3();

        System.out.println("First feeding hour:");
        float ora = s.nextFloat();
        System.out.println("Second feeding hour:");
        float ora1 = s.nextFloat();
        System.out.println("----------------------------------------------");
        System.out.println("FOR A DAY:");

        for(float j = 0;j < 24; j++) {
            for (float i = 0; i <= 60; i++) {
                //System.out.println("Ora este: " + (j + (i / 100F)));
                String formattedNum = String.format("%.2f", j + i/100f);
                if ((j+i/100f) == o1.setFeedingTime(ora)) {
                    System.out.println("First feeding at: " + formattedNum);
                    o1.setCurrentTime((j + (i / 100F)));
                 }
                if ((j+i/100f) == o1.setFeedingTime(ora1)) {
                    System.out.println("Second feeding at: " + formattedNum);
                    o1.setCurrentTime((j + (i / 100F)));
                }
                }
                    LightController l = new LightController();
                    //float w = l.getLightTime();
                    l.OnOffLight(j);
            }
        }
    }

