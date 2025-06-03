/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.builder;

/**
 *
 * @author Panda
 */
public class Computer {

    // Zorunlu alanlar (final, Constructor’da set edilecek)
    private final String cpu;
    private final int ram;
    private final int storage;

    // Opsiyonel alanlar (final, Constructor’da set edilecek)
    private final String gpu;             // örn. "NVIDIA RTX 3060"
    private final String operatingSystem; // örn. "Windows 11"
    private final boolean wifiEnabled;
    private final boolean bluetoothEnabled;

    // Private constructor: sadece Builder içinden tetiklenecek
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.operatingSystem = builder.operatingSystem;
        this.wifiEnabled = builder.wifiEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    // Sadece okunabilir getter'lar (isteğe bağlı)
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer {"
                + "cpu='" + cpu + '\''
                + ", ram=" + ram + "GB"
                + ", storage=" + storage + "GB"
                + ", gpu='" + (gpu != null ? gpu : "Yok") + '\''
                + ", OS='" + (operatingSystem != null ? operatingSystem : "Yok") + '\''
                + ", WiFi=" + wifiEnabled
                + ", Bluetooth=" + bluetoothEnabled
                + '}';
    }

    // ---------------------------------------------------
    // Inner static Builder sınıfı
    // ---------------------------------------------------
    public static class Builder {

        // Zorunlu alanlar
        private final String cpu;
        private final int ram;
        private final int storage;

        // Opsiyonel alanlar, default değerler atayalım
        private String gpu = null;
        private String operatingSystem = null;
        private boolean wifiEnabled = false;
        private boolean bluetoothEnabled = false;

        public Builder(String cpu, int ram, int storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Opsiyonel alanlar için chainable setter’lar:
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;         // return Builder, zincirleme yazabilmek için
        }

        public Builder setOperatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Builder setWifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
