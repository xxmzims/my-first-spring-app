package ru.ugrinovitch.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> listOfMusic = new ArrayList<>();

    public ClassicalMusic() {
        listOfMusic.add("Für Elise – Beethoven");
        listOfMusic.add("Canon in D Major – Pachelbel");
        listOfMusic.add("Moonlight Sonata – Beethoven");
    }
    @Override
    public List<String> getSong() {
        return listOfMusic;
    }
}
