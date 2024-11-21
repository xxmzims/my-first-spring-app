package ru.ugrinovitch.springApp;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    private static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my distraction");
    }
}
