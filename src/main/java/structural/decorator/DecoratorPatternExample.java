/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator;

/**
 *
 * @author Panda
 */
public class DecoratorPatternExample {

    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " | Cost:" + coffee.getCost());

        coffee = new WithMilk(coffee);
        System.out.println(coffee.getDescription() + " | Cost:" + coffee.getCost());

        coffee = new WithSugar(coffee);
        System.out.println(coffee.getDescription() + " | Cost:" + coffee.getCost());

    }

}
