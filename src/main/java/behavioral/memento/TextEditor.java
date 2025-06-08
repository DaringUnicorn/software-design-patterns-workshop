/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.memento;

/**
 *
 * @author Panda
 */
public class TextEditor {

    private String content;

    public void write(String text) {
        content = text;
        System.out.println("Su anki icerik: " + content);
    }

    public TextMemento save() {
        System.out.println("Icerik kaydedildi: " + content);
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        content = memento.getContent();
        System.out.println("Icerik geri yuklendi: " + content);
    }

}
