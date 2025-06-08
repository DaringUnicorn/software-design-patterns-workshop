/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.chainOfResponsibility;

/**
 *
 * @author Panda
 */
public class TeamLead extends ExpenseHandler {

    @Override
    public void handleExpense(int amount) {
        if (amount <= 1000) {
            System.out.println("TeamLead approved expense of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleExpense(amount);
        }
    }

}
