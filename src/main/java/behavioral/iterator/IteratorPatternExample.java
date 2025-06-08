/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.iterator;

/**
 *
 * @author Panda
 */
public class IteratorPatternExample {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository();
        Iterator<String> iterator = repository.getIterator();

        System.out.println("Koleksiyondaki isimler: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
