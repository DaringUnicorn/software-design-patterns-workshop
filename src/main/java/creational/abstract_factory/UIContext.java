/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstract_factory;

/**
 *
 * @author Panda
 */
public class UIContext {

    public Button button;
    public CheckBox checkBox;

    public UIContext(UIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }
}
