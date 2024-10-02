package org.example.file.music;

public class Mp3file extends AbstractMusicFile{
    private final int quality;

    public Mp3file(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }


    @Override
    public void play() {
        System.out.println("Playing mp3");

    }

}
