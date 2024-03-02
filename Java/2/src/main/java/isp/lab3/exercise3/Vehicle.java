package isp.lab3.exercise3;
public class Vehicle {

    private String model,type;
    private int speed;
    private char FuelType;

    public static int count = 0;
    Vehicle(String model, String type,int speed, char fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.FuelType = fuelType;
        count++;
    }
    public void setModel(String m){
        this.model = m;
    }
    public String getModel(){
        return model;
    }
    public void setType(String t){
        this.type = t;
    }
    public String getType(){
        return type;
    }
    public void setFuelType(char ft){
        this.FuelType = ft;
    }
    public char getFuelType(){
        return FuelType;
    }
    public void setSpeed(int s){
        this.speed = s;
    }
    public int getSpeed(){
        return speed;
    }
    public String toString(){
        return model+""+type+""+speed;
    }

    public static void main(String[] args) {
       /* String model = "Dacia";
        String type = "Logan";
        int speed = 150;
        char fueltype = 'B';
        */
        Vehicle v = new Vehicle("Ford","Focus",140,'C');
        Vehicle b = new Vehicle("Dacia","Logan",150,'B');
         /* v.setModel(model);
         v.setType(type);
         v.setSpeed(speed);
         v.setFuelType(fueltype);
        */
        System.out.println(v.getModel() + " (" + v.getType() + ") " + "speed " + v.getSpeed() + " fuel " + v.getFuelType());
        System.out.println(b.getModel() + " (" + b.getType() + ") " + "speed " + b.getSpeed() + " fuel " + b.getFuelType());
        System.out.println("Nr de obiecte create: " + Vehicle.count);
        System.out.println("Verificare egalitate: " + v.equals(b));
    }
}
