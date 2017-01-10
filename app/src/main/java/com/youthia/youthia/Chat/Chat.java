package com.youthia.youthia.Chat;

/**
 * Created by garia on 10-01-2017.
 */

public class Chat {
    String reciever, recieverMessage, sender, senderMessage;

    public Chat(String reciever, String recieverMessage, String sender, String senderMessage) {
        this.reciever = reciever;
        this.recieverMessage = recieverMessage;
        this.sender = sender;
        this.senderMessage = senderMessage;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getRecieverMessage() {
        return recieverMessage;
    }

    public void setRecieverMessage(String recieverMessage) {
        this.recieverMessage = recieverMessage;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
    }
}
