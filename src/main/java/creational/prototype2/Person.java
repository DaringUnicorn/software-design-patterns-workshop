/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Panda
 */
public class Person implements Cloneable {

    private String name;
    private int age;
    private List<String> hobbies;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>();
        hobbies.add("Kitap okumak");
        hobbies.add("Müzik dinlemek");
    }

    // set/get metotları
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("-------------------------------");
    }
}
