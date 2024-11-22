package ru.ugrinovitch.springApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
// помечаем класс конфигурационным
@Configuration
// где лежат наши бины
//@ComponentScan("ru.ugrinovitch.springApp")
// путь к файлу свойств
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }
    @Bean Computer computer() {
        return new Computer();
    }
}
