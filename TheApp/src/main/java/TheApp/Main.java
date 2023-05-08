package TheApp;


import Update.ConfigCreator;

public class Main {
    public static void main(String[] args) {
        ConfigCreator confCreator = new ConfigCreator();
        confCreator.createConfig();
        System.out.println("Hello world!");
        System.out.println(System.getProperty("user.dir"));

    }
}