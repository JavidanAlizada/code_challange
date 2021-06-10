package main.behavioral.mediator.messaging.service.impl;

import main.behavioral.mediator.messaging.MessageBroker;
import main.behavioral.mediator.messaging.service.Service;

public class BService extends Service {

    public BService(MessageBroker messageBroker) {
        super(messageBroker);
    }

    @Override
    public String toString() {
        return "BService";
    }
}
