package com.practice.DI;

public class EmailSevice implements MessagingInterface {


    public void sendMessage(String message) {
        System.out.println(message);
    }
}
