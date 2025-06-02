/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstract_factory;

/**
 *
 * @author Panda
 */
public class Client {

    private final UIContext context;

    public Client(UIFactory factory) {
        context = new UIContext(factory);
    }

    public void paintUI() {
        context.button.paint();
        context.checkBox.paint();
    }

    public static void main(String[] args) {
        // Runtime’da işletim sistemi veya config’e göre karar verelim:
        String osName = System.getProperty("os.name").toLowerCase();
        UIFactory factory;

        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        // Uygulamayı başlatırken ilgili factory’yi veriyoruz
        Client client = new Client(factory);
        client.paintUI();
    }
}
