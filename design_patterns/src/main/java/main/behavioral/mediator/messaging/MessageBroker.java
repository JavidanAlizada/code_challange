package main.behavioral.mediator.messaging;

import main.behavioral.mediator.messaging.dto.Message;
import main.behavioral.mediator.messaging.server.RegistryServer;
import main.behavioral.mediator.messaging.service.Service;

public class MessageBroker {

    private RegistryServer registryServer;

    public MessageBroker(RegistryServer registryServer) {
        this.registryServer = registryServer;
    }

    public void sendMessageToAllServices(Message message, Service publisherService) {
        if (registryServer.getServices().isEmpty())
            throw new RuntimeException("Registry server is empty. There is no service for sharing message");
        registryServer
                .getServices()
                .stream()
                .filter(s -> !s.getClass().getSimpleName().equals(publisherService.getClass().getSimpleName()))
                .forEach(service -> receiveMessageFromQueue(service, message));
    }

    public void sendMessage(Message message, Service publisherService, Service receiverService) {
        if (registryServer.getServices().isEmpty() || !registryServer.getServices().contains(receiverService))
            throw new RuntimeException("Registry server is empty. " + receiverService + " does not exists in server");
        if (receiverService.equals(publisherService))
            throw new RuntimeException("Cannot share message with the same service");
        receiveMessageFromQueue(receiverService, message);
    }

    private void receiveMessageFromQueue(Service receiverService, Message message) {
        System.out.println(message + " is received by " + receiverService);
    }
}
