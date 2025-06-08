/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Panda
 */
public class StatisticsDisplay implements Observer {

    private List<Float> tempHistory = new ArrayList<>();

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempHistory.add(temperature);
        display();
    }

    public void display() {
        float sum = 0;
        for (float t : tempHistory) {
            sum += t;
        }
        float avg = sum / tempHistory.size();
        System.out.println("Avg temperature: " + avg + "F");
    }
}
