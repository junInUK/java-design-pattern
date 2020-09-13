package com.design.pattern.Action;

public class ShortMessageAction extends Action{
    public ShortMessageAction(String destination, String message) {
        super(destination, message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Send short message["+super.getMessage() + " to " + super.getDestination());
    }
}
