package main.behavioral.mediator.messaging.service.impl;

import main.behavioral.mediator.messaging.MessageBroker;
import main.behavioral.mediator.messaging.service.Service;

public class DService extends Service {

    public DService(MessageBroker messageBroker) {
        super(messageBroker);
    }

    @Override
    public String toString() {
        return "DService";
    }
}
