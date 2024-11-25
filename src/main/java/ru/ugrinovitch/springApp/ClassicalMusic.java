package ru.ugrinovitch.springApp;

import org.springframework.stereotype.Component;


@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Für Elise – Beethoven";
    }
}
