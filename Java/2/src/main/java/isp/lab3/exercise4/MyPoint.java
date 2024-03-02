package isp.lab3.exercise4;

public class MyPoint {
    int x,y,z;

    MyPoint(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int distance(int xx, int yy, int zz){
        int distx = x-xx;
        int disty = y-yy;
        int distz = z-zz;

        return (int) Math.sqrt(distx*distx + disty*disty + distz*distz);
    }
    public int distance(MyPoint another){
        int distx = x-another.x;
        int disty = y-another.y;
        int distz = z-another.z;

        return (int) Math.sqrt(distx*distx + disty*disty + distz*distz);
    }

    public static void main(String[] args){

        MyPoint p1 = new MyPoint(1,2,3);
        MyPoint p2 = new MyPoint(4,5,6);
        int distanta = p1.distance(p2);
        System.out.println("Distanta este: " + distanta);

    }
}
