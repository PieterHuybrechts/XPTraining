package com.cegeka.spacebook;

import java.util.Date;

public class Message {
    private Person sender;
    private Date sendDate;
    private String body;

    public Message(Person sender, Date sendDate, String body) {
        this.sender = sender;
        this.sendDate = sendDate;
        this.body = body;
    }

    public Message(Person sender, String body) {
        this(sender, new Date(),body);
    }

    public Person getSender() {
        return sender;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public String getBody() {
        return body;
    }
}
