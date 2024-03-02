package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Race!");

        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();
        SemaphorePanel semaphorePanel = new SemaphorePanel();

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        frame.getContentPane().add(semaphorePanel);
        frame.pack();
        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,300);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        semaphoreThread.join();

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        Sound ps = new Sound();
        ps.playSound();
        Thread.sleep(9000);
        ps.stopSound();
    }
}