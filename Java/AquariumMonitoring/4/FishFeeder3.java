package aut.isp.lab4.exercise4;

public class FishFeeder3 {

    private static int meals = 14;
    FishFeeder3(){
    }
    public void feed(){

        if(meals > 0) {
            System.out.println("Feeding");
            this.meals--;
            System.out.println("Meals left: ");
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
