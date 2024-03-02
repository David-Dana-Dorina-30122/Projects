package isp.lab4.exercise2;

public class SmartWatch implements Chargeable {
    private int batteryLevel = 0;

    @Override
    public void charge(int duration) {
        if(duration <= 15) {
            batteryLevel += 4 * duration; //in one minute the battery gets at 4%
            System.out.println("The battery of the smartwatch is charging for: " + duration);
            } else {batteryLevel = 100;
                System.out.println("The battery of the smartwatch is overcharging for: " + duration);
                   }
        }

    @Override
    public void getBatteryLevel() {
        System.out.println("Smartwatch's battery level is at " + this.batteryLevel + "%");
    }
}
