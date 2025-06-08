/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.chainOfResponsibility;

/**
 *
 * @author Panda
 */
public abstract class ExpenseHandler {

    protected ExpenseHandler nextHandler;

    public void setNextHandler(ExpenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleExpense(int amount);
}
