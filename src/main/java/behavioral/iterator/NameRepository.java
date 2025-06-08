/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.iterator;

/**
 *
 * @author Panda
 */
public class NameRepository implements Container<String> {

    private String[] names = {
        "Ali", "Veli", "Ayse", "Fatma"
    };

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                return null;
            }
            return names[index++];
        }

    }
}
