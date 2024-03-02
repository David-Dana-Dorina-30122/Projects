package aut.isp.lab4.exercise4;

public class LightController {

    /*
    private float lightTime;
    public void setLightTime(float light){
        this.lightTime = light;
    }
    public float getLightTime(){
        return this.lightTime;
    }
    public String toString(){
      return lightTime + "";
    }
     */
    public void OnOffLight(float lightTime) {
        if (lightTime % 6 == 0 && lightTime != 24) {
            String formattedNum = String.format("%.2f", lightTime);
            System.out.println("Light on at: " + formattedNum);
        } else if ((lightTime - 2) % 6 == 0) {
            String formattedNum = String.format("%.2f", lightTime);
            System.out.println("Light off at: " + formattedNum);
        }
    }

}