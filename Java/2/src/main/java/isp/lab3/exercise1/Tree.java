package isp.lab3.exercise1;

public class Tree {

    int height = 15;
    Tree(){
        this.height = height;
    }

    public void grow(int meters){
        if(meters >= 1)
            height += meters;
        System.out.println( this.height + "");
    }
    public String toString(){
        return this.height + "";
    }
    public static void main(String[] args) {
        //int height = 15;
        Tree t = new Tree();
        t.grow(16);
        t.toString();
    }

}
