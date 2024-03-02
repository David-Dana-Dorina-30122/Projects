package aut.isp.lab4.exercise2;

public class FishFeeder {

    private int meals = 14;

    public void feed(){
        if(meals > 0) {
            meals--;
        }
        if(meals == 0)
            fillUp();
    }
    public void fillUp(){
        meals = 14;
    }
    public String toString(){
        return meals + "";
    }
}
