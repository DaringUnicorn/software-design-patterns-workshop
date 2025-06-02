package creational.singleton;

public class MySingleton {

    // 1. Nesnenin tek örnepği, private ve static
    private static MySingleton instance;

    // 2. Constructor private, başka yerden new ile kullanılamaz
    private MySingleton() {
        // Gerekli başlangıç işlemleri
    }

    // 3. Dışarıya tek erişim metodu
    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();

        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton üzeerinden iş yapılıyor.");
    }

}


