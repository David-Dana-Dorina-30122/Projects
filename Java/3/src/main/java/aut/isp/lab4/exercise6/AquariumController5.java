package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise3.FishFeeder2;

public class AquariumController5 {
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
        FishFeeder5 f = new FishFeeder5();
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
    Alarm1 alarm = new Alarm1();
    Heater1 heater = new Heater1();
    LevelSensor1 ls = new LevelSensor1();
    TemperatureSensor1 ts = new TemperatureSensor1();
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
