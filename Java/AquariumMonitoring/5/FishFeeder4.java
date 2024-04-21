package aut.isp.lab4.exercise5;

public class FishFeeder4 {
    private static int meals = 14;
    FishFeeder4(){
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
