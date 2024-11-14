package ru.ugrinovitch.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");
        // получаем объект из bean-файла
        Music music = context.getBean("musicBean", Music.class);

        // Внедреннее зависимости
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        context.close();
    }
}
