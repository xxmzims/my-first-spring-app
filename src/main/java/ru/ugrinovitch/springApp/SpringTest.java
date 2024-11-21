package ru.ugrinovitch.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");
        // получаем объект из bean-файла
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music ClassicalMusic = context.getBean("classicalMusic", Music.class);
        // Внедрение зависимости
        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
        MusicPlayer musicPlayer2 = new MusicPlayer(ClassicalMusic);
        musicPlayer.playMusic();
        musicPlayer2.playMusic(); 
        context.close();
    }
}
