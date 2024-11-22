package ru.ugrinovitch.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> listOfMusic = new ArrayList<>();
    public RockMusic() {
        listOfMusic.add("The Beatles");
        listOfMusic.add("Queen");
        listOfMusic.add("Prince and The Revolution");
    }
    @Override
    public List<String> getSong() {
        return listOfMusic;
    }
}
