/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Panda
 */
public class TreeFactory {

    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;
        TreeType type = treeTypes.get(key);
        if (type == null) {
            type = new TreeType(name, color);
            treeTypes.put(key, type);
        }
        return type;
    }
}
