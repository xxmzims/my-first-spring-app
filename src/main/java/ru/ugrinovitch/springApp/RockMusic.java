package ru.ugrinovitch.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    public RockMusic() {
    }
    @Override
    public String getSong() {
        return "The Beatles";
    }
}
