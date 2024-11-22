package ru.ugrinovitch.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music rockGenre;
    private Music classicalGenre;
    private String name;
    private int volume;


    // IoC
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockGenre, @Qualifier("classicalMusic") Music classicalGenre) {
        this.rockGenre = rockGenre;
        this.classicalGenre = classicalGenre;
    }

    public void playMusic(Style style) {
        String song = "";
        Random random = new Random();
        if(style.equals(Style.ROCK)){
            List<String> listOfMusic = rockGenre.getSong();
            song = listOfMusic.get(random.nextInt(listOfMusic.size()));
        }
        else if(style.equals(Style.CLASSICAL)) {
            List<String> listOfMusic = classicalGenre.getSong();
            song = listOfMusic.get(random.nextInt(listOfMusic.size()));
        }
        System.out.printf("Playing genre: %s. Playing song: %s", style, song);
    }
}
