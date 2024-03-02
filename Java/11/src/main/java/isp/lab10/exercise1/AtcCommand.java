package isp.lab10.exercise1;

public class AtcCommand {
}
class TakeoffCommand extends AtcCommand{
    int altitude;

    public  TakeoffCommand(int altitude){
        this.altitude = altitude;
    }
}
class LandCommand extends AtcCommand{}