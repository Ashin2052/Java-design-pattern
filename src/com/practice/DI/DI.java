package com.practice.DI;

public class DI {
    MessagingInterface messagingInterface;
    public DI(MessagingInterface messagingInterface)
    {
        this.messagingInterface = messagingInterface;

    }
    public void doSomeStuff()
    {
   messagingInterface.sendMessage("email message");
    }
}
