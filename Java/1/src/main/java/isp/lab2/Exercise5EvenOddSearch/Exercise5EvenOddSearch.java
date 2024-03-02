package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] b = input.split(",");
        int a[] = new int[b.length];

        for(int i = 0; i < b.length; i++) {
           a[i] = Integer.parseInt(b[i]);
        }
        int min = a[0], max = a[0];
        int pozmin = 0 ,pozmax = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max && a[i]%2 == 0) {
                max = a[i];
               pozmax = i;
            }
            if(a[i] < min && a[i]%2 != 0) {
                min = a[i];
                pozmin = i;
            }
        }
        int mm[] =new int[4];
        mm[0] = min;
        mm[1] = pozmin;
        mm[2] = max;
        mm[3] = pozmax;

        if (mm[0] == 0 && mm[0] == 0)
            System.out.println("Sirul este gol");
        if (mm[0] == 0 || mm[2] % 2 !=0)
            System.out.println("Nu avem numere pare");
        else if (mm[2] == 0 || mm[0] % 2 == 0)
            System.out.println("Nu avem numere impare");

        return mm;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
