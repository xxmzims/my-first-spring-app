package ru.ugrinovitch.springApp;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> genreList;
    // IoC
    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        Random random = new Random();
        int index = random.nextInt(genreList.size());
        Music music = genreList.get(index);
        System.out.println(music.getSong());
    }
}
