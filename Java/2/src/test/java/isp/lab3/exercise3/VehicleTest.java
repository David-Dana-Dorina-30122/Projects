package isp.lab3.exercise3;
import isp.lab3.exercise3.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

class VehicleTest {
    @Test
   /* public void equals(){
        Vehicle v = new Vehicle("Ford","Focus",140,'C');
        Vehicle b = new Vehicle("Dacia","Logan",150,'B');
        assertEquals(v,b);
    }
    public void objcreated(){
        assertEquals(2,Vehicle.count);
    }
    */
    public void tostringtest(){
    Vehicle s = new Vehicle("Dacia","Logan",150,'B');
    Assertions.assertEquals("Dacia" + "" + "Logan" + "" +150,s.toString());

    }
}