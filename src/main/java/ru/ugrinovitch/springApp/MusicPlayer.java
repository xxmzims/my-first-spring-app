package ru.ugrinovitch.springApp;

public class MusicPlayer {
    private Music music;
    // IoC
    MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
