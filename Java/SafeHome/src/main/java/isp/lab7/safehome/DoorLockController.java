package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface{
    Map<String,String> validAccess = new HashMap<>();
    private int count = 0;
    private DoorStatus status;

    //Map<String,String> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    public DoorStatus enterPin(String pin) throws InvalidPinException,TooManyAttemptsException{
        if(count >=3){
            throw new TooManyAttemptsException();
        }
            if(MASTER_KEY == pin) {
                count++;
                throw new InvalidPinException();
            }
            if(MASTER_KEY == pin) {
                count = 0;
                if (DoorStatus.CLOSE.equals("CLOSE")) {
                    status = DoorStatus.OPEN;
                } else status = DoorStatus.CLOSE;
            }
        return status;
    }

    public void addTenant(String pin, String tenantName) throws TenantAlreadyExistsException{
            if(validAccess.containsValue(tenantName))
                throw new TenantAlreadyExistsException();
            else {
                validAccess.put(tenantName,pin);
                System.out.println("Tenant added");
            }
    }
    public void removeTenant(String name) throws TenantNotFoundException{
            if(!validAccess.containsValue(name))
                throw new TenantNotFoundException();
            else {
                validAccess.remove(name);
                System.out.println("Tenant removed");
            }
    }
    public List<AccessLog> getAccessLogs(){
        for (Map.Entry<String,String> entry : validAccess.entrySet()) {
            list.add(entry.getValue());
            /**System.out.println(entry.getKey() + " " + entry.getValue());**/
        }
        return null;
    }
}
