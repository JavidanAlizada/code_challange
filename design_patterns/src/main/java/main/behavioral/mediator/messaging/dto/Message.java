package main.behavioral.mediator.messaging.dto;

import main.behavioral.mediator.messaging.service.Service;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class Message implements Serializable {

    private String id;
    private String content;
    private LocalDateTime sendDate;

    public Message(String content) {
        this.id = UUID.randomUUID().toString();
        this.content = content;
        this.sendDate = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", sendDate=" + sendDate +
                '}';
    }
}
