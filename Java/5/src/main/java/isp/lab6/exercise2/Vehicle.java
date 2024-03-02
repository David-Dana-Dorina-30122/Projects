package isp.lab6.exercise2;

public class Vehicle <N,V,M,MD,Y>{
    private N VIN;
    private V licensePlate;
    private M make;
    private MD model;
    private Y year;
    public Vehicle(N vin,V licensePlate,M make,MD model, Y year){
        this.VIN = vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public Vehicle(N vin) {
        this.VIN = vin;
    }

    public N getVin() {
        return VIN;
    }

    public void setVin(N vin) {
        this.VIN = vin;
    }

    public V getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(){
        this.licensePlate = licensePlate;
    }

    public M getMake() {
        return make;
    }

    public void setMake(M make) {
        this.make = make;
    }

    public MD getModel() {
        return model;
    }

    public void setModel(MD model) {
        this.model = model;
    }

    public Y getYear() {
        return year;
    }

    public void setYear(Y year) {
        this.year = year;
    }
    public String toString() {
        return "VIN: " + VIN + ", License Plate: " + licensePlate +
                ", Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}