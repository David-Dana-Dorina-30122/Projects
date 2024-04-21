package isp.lab4.exercise2;

import org.apache.log4j.ConsoleAppender;
import org.w3c.dom.ls.LSOutput;

public class Laptop implements Chargeable{
    private int batteryLevel = 0;

    @Override
    public void charge(int duration) {
        if(duration <= 50) {
            batteryLevel += 2 * duration; //in one minute the battery gets at 2%
            System.out.println("The battery of the laptop is charging for: " + duration);
        } else {batteryLevel = 100;
            System.out.println("The battery of the laptop is overcharging for: " + duration);
        }
    }

    @Override
    public void getBatteryLevel() {
        System.out.println("Laptop's battery level is at " + this.batteryLevel + "%");
    }
}
