package com.design.pattern.Action;

import static com.design.pattern.Action.ActionType.*;

public class Factory {
    public static Action generateAction(ActionType type){
        Action action;
        switch(type){
            case EMAIL:
                action = new EmailAction("Sam", "Hello");
                break;
            case SHORT_MESSAGE:
                action = new ShortMessageAction("jane", "ni hao");
                break;
            default:
                action = null;
        }
        return action;
    }

    public static void main(String[] args){
        Action action = generateAction(EMAIL);
        action.sendMessage();

    }
}
