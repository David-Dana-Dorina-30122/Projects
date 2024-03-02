package aut.isp.lab4.exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alarm alarm = new Alarm();
        LevelSensor levelSensor = new LevelSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        Heater heater = new Heater();
        float presetValueWaterLevel = 15.5F;
        int minPresetValueTemperature = 24;
        int maxPresetValueTemperature = 27;

        System.out.println("The current water level: ");
        float level = scanner.nextFloat();
        levelSensor.setValue(level);

        if (levelSensor.getValue() < presetValueWaterLevel) {
            alarm.turnOn();
        }
        System.out.println("The current temperature: ");
        int temp = scanner.nextInt();
        temperatureSensor.setValue(temp);

        if(temperatureSensor.getValue() < minPresetValueTemperature){
            heater.turnOn();
        } else if (temperatureSensor.getValue() > maxPresetValueTemperature) {
            heater.turnOff();
        }
    }
}
