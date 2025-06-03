/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter2;

/**
 *
 * @author Panda
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Sadece mp3 ise doğrudan çal
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("MP3 oynatılıyor: " + fileName);
        } // Adapter üzerinden diğer formatları çal
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Geçersiz medya formatı: " + audioType + " formatı desteklenmiyor.");
        }
    }
}
