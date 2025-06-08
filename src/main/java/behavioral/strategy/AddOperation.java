/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.strategy;

/**
 *
 * @author Panda
 */
public class AddOperation implements Operation {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
