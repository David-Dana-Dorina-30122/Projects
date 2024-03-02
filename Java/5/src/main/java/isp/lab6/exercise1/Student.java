package isp.lab6.exercise1;

import java.util.HashMap;

public class Student <N,V>{
    private N name;
    private V ID;

    private HashMap<N,V> grades;
    public Student(N name, V ID){
        this.name = name;
        this.ID = ID;
        this.grades = new HashMap<>();
    }
    public void setName(N nume){
        this.name = nume;
    }
    public N getName(){
        return this.name;
    }
    public void setID(V id){
        this.ID = id;
    }
    public V getID(){
        return this.ID;
    }
    public void addGrade(N subject,V grade){
        this.grades.put(subject,grade);
    }

    public HashMap<N,V> getGrades(){
        return this.grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (V gr : this.grades.values()) {
            sum += (int)gr;
        }
        return (double) sum / this.grades.size();
    }
    public String toString() {
        return "Name: " + name + "\n" +
                "ID: " + ID + "\n" +
                "Grades: " + grades.toString();
    }


}
