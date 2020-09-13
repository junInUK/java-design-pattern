package com.design.pattern.Action;

public class EmailAction extends Action{

    public EmailAction(String destination, String message) {
        super(destination, message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Send Message[" + super.getMessage() + "] to " + super.getDestination());
    }
}
