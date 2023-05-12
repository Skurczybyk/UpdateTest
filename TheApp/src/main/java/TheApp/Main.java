package TheApp;


import Update.ConfigCreator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConfigCreator confCreator = new ConfigCreator();
        System.out.println("Hello world!");
        System.out.println(System.getProperty("user.dir"));
        confCreator.showPath();
        try {
            confCreator.createConfig();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}