/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Panda
 */
public class History {

    private final List<TextMemento> savedStates = new ArrayList<>();

    public void push(TextMemento memento) {
        savedStates.add(memento);
    }

    public TextMemento pop() {
        if (savedStates.isEmpty()) {
            return null;
        }
        return savedStates.remove(savedStates.size() - 1);
    }
}
