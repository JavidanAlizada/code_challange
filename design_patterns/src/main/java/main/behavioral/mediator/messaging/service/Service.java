package main.behavioral.mediator.messaging.service;

import main.behavioral.mediator.messaging.MessageBroker;
import main.behavioral.mediator.messaging.dto.Message;

public abstract class Service {

    private MessageBroker messageBroker;

    public Service(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    public void sendAll(Message message) {
        messageBroker.sendMessageToAllServices(message, this);
    }

    public void sendMessageToReceiver(Service service, Message message) {
        messageBroker.sendMessage(message, this, service);
    }

}
