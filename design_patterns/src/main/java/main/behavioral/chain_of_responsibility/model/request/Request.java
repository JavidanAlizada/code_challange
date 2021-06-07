package main.behavioral.chain_of_responsibility.model.request;

import main.behavioral.chain_of_responsibility.constant.Operations;

public class Request {

    private Operations operations;

    public Request(Operations operations) {
        this.operations = operations;
    }

    public Operations getOperations() {
        return operations;
    }


    @Override
    public String toString() {
        return "Request{" +
                "operations=" + operations +
                '}';
    }
}
