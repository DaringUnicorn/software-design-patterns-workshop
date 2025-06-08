/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.strategy;

/**
 *
 * @author Panda
 */
public class Calculator {

    private Operation strategy;

    public void setStrategy(Operation strategy) {
        this.strategy = strategy;
    }

    public int compute(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy ayarlanmamis!");

        }
        return strategy.execute(a, b);
    }
}
