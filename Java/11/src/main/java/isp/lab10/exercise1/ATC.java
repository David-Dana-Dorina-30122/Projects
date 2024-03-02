package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ATC {
    List<Aircraft> aircraftList = new ArrayList<>();

    public  void sendCommand(String aircraftId,AtcCommand cmd) {
        aircraftList.forEach((a) -> {
            if (a.id.equals(aircraftId)) {
                synchronized (a) {
                    a.receiveAtcCommand(cmd);
                    a.notify();
                }
            }
        });
    }
}
