package isp.lab3.exercise2;

public class Rectangle {

    private int length =2 ,width = 1;
    private String color = "red";

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }
    public int getPerimeter(){
        int perim = 2 * (length + width);
        return perim;
    }
    public int getArea(){
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {

        Rectangle rec;
        Rectangle rec2;
        rec= new Rectangle(2,2,"green");
        rec2 = new Rectangle(4,5);
        System.out.println("Obiectul rec are lungimea " + rec.length + ",latimea " + rec.width + ",culoarea " + rec.color + ",perimetrul " + rec.getPerimeter());
        System.out.println("Obiectul rec2 are lungimea " + rec2.length + ",latimea " + rec2.width + ",perimetrul " + rec2.getPerimeter() + ",aria " + rec2.getArea());
    }

}