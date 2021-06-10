package main.behavioral.mediator.messaging;

import main.behavioral.mediator.messaging.dto.Message;
import main.behavioral.mediator.messaging.server.RegistryServer;
import main.behavioral.mediator.messaging.service.Service;
import main.behavioral.mediator.messaging.service.impl.AService;
import main.behavioral.mediator.messaging.service.impl.BService;
import main.behavioral.mediator.messaging.service.impl.CService;
import main.behavioral.mediator.messaging.service.impl.DService;

public class Main {

    public static void main(String[] args) {
        RegistryServer server = new RegistryServer();
        MessageBroker messageBroker = new MessageBroker(server);
        Service aService = new AService(messageBroker);
        Service bService = new BService(messageBroker);
        Service cService = new CService(messageBroker);
        Service dService = new DService(messageBroker);
        server.setServices(aService, bService, cService, dService);

        dService.sendAll(new Message("message"));
        System.out.println("\n");
        cService.sendMessageToReceiver(dService, new Message("Here is Message"));


    }
}
