/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.strategy;

/**
 *
 * @author Panda
 */
public class StrategyPatternExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new AddOperation());
        System.out.println("5 + 3 = " + calculator.compute(5, 3));

        calculator.setStrategy(new SubtractOperation());
        System.out.println("5 - 3 = " + calculator.compute(5, 3));

        calculator.setStrategy(new MultiplyOperation());
        System.out.println("5 * 3 = " + calculator.compute(5, 3));

        calculator.setStrategy((a, b) -> (int) Math.pow(a, b));
        System.out.println("5 ^ 3 = " + calculator.compute(5, 3));
    }
}
