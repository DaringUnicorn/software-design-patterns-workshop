/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.memento;

/**
 *
 * @author Panda
 */
public class MementoPatternExample {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Merhaba");
        history.push(editor.save());

        editor.write("Merhaba Dunya");
        history.push(editor.save());

        editor.write("Merhaba Dunya, Nasilsin?");
        history.push(editor.save());

        editor.restore(history.pop());
        editor.restore(history.pop());

    }
}
