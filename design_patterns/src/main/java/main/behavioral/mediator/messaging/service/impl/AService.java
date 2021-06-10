package main.behavioral.mediator.messaging.service.impl;

import main.behavioral.mediator.messaging.MessageBroker;
import main.behavioral.mediator.messaging.service.Service;

public class AService extends Service {

    public AService(MessageBroker messageBroker) {
        super(messageBroker);
    }

    @Override
    public String toString() {
        return "AService";
    }
}
