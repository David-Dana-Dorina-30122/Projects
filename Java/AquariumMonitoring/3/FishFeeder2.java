package aut.isp.lab4.exercise3;

public class FishFeeder2 {
    private static int meals = 14;
    FishFeeder2(){

    }
    public void feed(){

        if(meals > 0) {
            System.out.println("Feeding");
            this.meals--;
        }
        if(meals == 0) {
            System.out.println("Refill");
            fillUp();
        }
    }
    public void fillUp(){
        this.meals = 14;
    }
    public String toString(){
        return meals + "";

    }
}
