/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.chainOfResponsibility;

/**
 *
 * @author Panda
 */
public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        ExpenseHandler teamLead = new TeamLead();
        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();

        teamLead.setNextHandler(manager);
        manager.setNextHandler(director);

        int[] requests = {500, 1500, 6000, 25000};

        for (int amount : requests) {
            teamLead.handleExpense(amount);
        }
    }
}
