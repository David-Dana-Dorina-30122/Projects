package isp.lab2.Exercise1RandomArray;
import java.util.Random;

public class Exercise1RandomArray {
    public static int[] getArrayOfRandomNumbers(int n) {
        Random r = new Random();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = r.nextInt();
        }
        System.out.println(n + " ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int min=array[0],max=0;
        int mm[] = new int[2];
        for(int i = 0; i< array.length; i++)
        {
            if(min > array[i])
                min = array[i];
            if(max < array[i])
                max = array[i];
        }
        mm[0] = min;
        mm[1] = max;

            return mm;
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
