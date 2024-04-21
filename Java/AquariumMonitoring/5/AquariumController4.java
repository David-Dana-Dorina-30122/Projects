package aut.isp.lab4.exercise5;

import aut.isp.lab4.exercise3.FishFeeder2;
import aut.isp.lab4.exercise4.FishFeeder3;

public class AquariumController4 {
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder2 feeder;
    private int temperature;
    private int level;
    //constructors
    //methods
    public float setCurrentTime(float currentTime){
        FishFeeder4 f = new FishFeeder4();
        this.currentTime = currentTime;
        if(currentTime == feedingTime) {
            f.feed();
        }
        System.out.println(f.toString());
        return this.currentTime;
    }

    public float setFeedingTime(float feedingTime){
        return this.feedingTime = feedingTime;
    }
    Alarm alarm = new Alarm();
    Heater heater = new Heater();
    LevelSensor ls = new LevelSensor();
    TemperatureSensor ts = new TemperatureSensor();
    public void checkTemperature(){
        if(temperature < 24)
            heater.turnOn();

        if(temperature == 24 || temperature > 27)
            heater.turnOff();
    }
    public void checkWaterLevel(){
        if(ls.getValue() < level){
            alarm.turnOn();
        }
    }
    public String toString(){
        return currentTime + "";
    }
}
