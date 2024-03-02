package isp.lab3.exercise5;
import isp.lab3.exercise5.VendingMachine;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class VendingMachineTest{
    @Test
    public void displayProductsTest(){
        VendingMachine d = new VendingMachine();
        assertEquals("1 - Chips \n2 - Soda \n3 - Snickers",d.displayProducts());
    }
    public void insertCoinTest(){

    }
    public void selectProduct(){

    }

}