/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.interpreter;

/**
 *
 * @author Panda
 */
public class InterpreterPatternExample {

    public static void main(String[] args) {
        Expression expression = new MinusExpression(
                new PlusExpression(
                        new NumberExpression(5),
                        new NumberExpression(3)),
                new NumberExpression(2));

        int result = expression.interpret();
        System.out.println("Result of (5 + 3) - 2 = " + result);
    }

}
