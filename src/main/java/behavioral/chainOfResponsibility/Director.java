/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.chainOfResponsibility;

/**
 *
 * @author Panda
 */
public class Director extends ExpenseHandler {

    @Override
    public void handleExpense(int amount) {
        if (amount <= 20000) {
            System.out.println("Director approved expense of $" + amount);

        } else {
            System.out.println("Expense of $" + amount + " requires CEO approval!");
        }

    }

}
