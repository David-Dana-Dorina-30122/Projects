package isp.lab3.exercise4;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertEquals;
import isp.lab3.exercise4.MyPoint;
import static org.junit.jupiter.api.Assertions.*;

public class MyPointTest{
    @Test
    public void disttest(){
        MyPoint mp = new MyPoint(1, 2, 3);
        MyPoint mp2 = new MyPoint(4, 5, 6);
        assertEquals(5, mp.distance(mp2));
    }
}