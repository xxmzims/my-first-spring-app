package ru.ugrinovitch.springApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean public List<Music> genresMusic() {
        return Arrays.asList(rockMusic(), jazzMusic(), classicalMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genresMusic());
    }
}
