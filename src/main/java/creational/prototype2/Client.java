/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype2;

/**
 *
 * @author Panda
 */
public class Client {

    public static void main(String[] args) {
        // 1) Orijinal bir Person oluştur
        Person p1 = new Person("Ahmet", 30);
        System.out.println("=== Orijinal p1 ===");
        p1.printInfo();
        // Çıktı:
        // Name: Ahmet, Age: 30
        // Hobbies: [Kitap okumak, Müzik dinlemek]

        // 2) p1’den shallow-copy (kopya) oluştur
        Person p2 = (Person) p1.clone();
        System.out.println("=== p2 Klon (shallow) ===");
        p2.printInfo();
        // Hâlâ:
        // Name: Ahmet, Age: 30
        // Hobbies: [Kitap okumak, Müzik dinlemek]

        // 3) p2 üzerinde birkaç değişiklik yapalım
        p2.setAge(25);
        p2.addHobby("Seyahat etmek");

        System.out.println("=== Değişikliklerden Sonra ===");
        System.out.println("--- p2 Bilgisi ---");
        p2.printInfo();
        System.out.println("--- p1 Bilgisi ---");
        p1.printInfo();
    }
}
