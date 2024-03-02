package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.FishFeeder;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    //constructors
    //methods
    public void setCurrentTime(float currentTime){
        this.currentTime = currentTime;
    }
    public String toString(){
        return currentTime + "";
    }
    public float setFeedingTime(float feedingTime){
        return this.feedingTime = feedingTime;
    }
}
