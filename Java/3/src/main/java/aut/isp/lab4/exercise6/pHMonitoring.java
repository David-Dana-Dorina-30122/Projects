package aut.isp.lab4.exercise6;


public class pHMonitoring {

    private int pHLevel;

    public void setpHLevel(int pHLevel){
        this.pHLevel = pHLevel;
    }
    public int getpHLevel(){
        return this.pHLevel ;
    }

    public void pHController(int level){
        Alarm1 alarm = new Alarm1();
        if(getpHLevel() < 7){
            System.out.println("pH level too low");
            alarm.turnOn();
        } else if (getpHLevel() > 8) {
            System.out.println("pH level too high");
            alarm.turnOn();
        }else alarm.turnOff();
    }

}
