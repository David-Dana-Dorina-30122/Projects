package isp.lab4.exercise2;

public class SmartPhone implements Chargeable {
    private int batteryLevel = 0;

    @Override
    public void charge(int duration) {
        if(duration <= 50) {
            batteryLevel += duration; //in one minute the battery gets at 1%
            System.out.println("The battery of the smartphone is charging for: " + duration);
        } else {batteryLevel = 100;
            System.out.println("The battery of the smartphone is overcharging for: " + duration);
        }
    }

    @Override
    public void getBatteryLevel() {
        System.out.println("Smartphone's battery level is at " + this.batteryLevel + "%");
    }
}
