package ru.ugrinovitch.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");
        // получаем объект из bean-файла
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Style.ROCK);

        context.close();
    }
}
