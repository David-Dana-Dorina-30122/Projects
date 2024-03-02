package isp.lab10.exercise1;

public class Exercise1 {

    public static void main(String[] args) throws InterruptedException {
        ATC controlCenter = new ATC();

        Aircraft a = new Aircraft("AIR001");
        controlCenter.aircraftList.add(a);
        Thread t = new Thread(a);
        t.start();

        Thread.sleep(12000);
        controlCenter.sendCommand("AIR001", new TakeoffCommand());
    }
}
