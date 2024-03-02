package isp.lab10.exercise1;

public class Aircraft implements Runnable{
    public String id;
    private int altitude;
    private  AtcCommand cmd;

    public Aircraft(String id){
        this.id = id;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    public void receiveAtcCommand(AtcCommand cmd){
        if(cmd instanceof TakeoffCommand){
            this.altitude = ((TakeoffCommand) cmd).altitude;
        }else if(cmd instanceof LandCommand){

        }
    }


    public void run(){
        System.out.println("On stand");
        synchronized (this){
        try {
            this.wait();
        } catch (InterruptedException e) {
        }
        }
        System.out.println("Taxing");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
        System.out.println("Taking off");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        System.out.println("Ascending");
        int currentAltitude = 0;
        while(currentAltitude < altitude){
            altitude+=1000;
            System.out.println("Gaining altitude: " + currentAltitude);
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){}
        }
        System.out.println("Cruising");
        System.out.println("Descending");
        while(currentAltitude > 0){
            currentAltitude-=1000;
            System.out.println("Losing altitude: " + currentAltitude);
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){}
        }
        System.out.println("Landing");

    }
}
