package aut.isp.lab4.exercise3;

public class AquariumController2 {
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder2 feeder;
    //constructors
    //methods
    public float setCurrentTime(float currentTime){
        FishFeeder2 f = new FishFeeder2();
        this.currentTime = currentTime;
        if(currentTime == feedingTime) {
            f.feed();
        }
        System.out.println( f.toString());
            return this.currentTime;
    }
    public String toString(){
        return currentTime + "";
    }
    public float setFeedingTime(float feedingTime){
        return this.feedingTime = feedingTime;
    }

}
