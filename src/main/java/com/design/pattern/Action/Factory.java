package com.design.pattern.Action;

import static com.design.pattern.Action.ActionType.*;

public class Factory {
    public static Action generateAction(ActionType type, String receiver, String message){
        Action action;
        switch(type){
            case EMAIL:
                action = new EmailAction(receiver,message);
                break;
            case SHORT_MESSAGE:
                action = new ShortMessageAction(receiver,message);
                break;
            default:
                action = null;
        }
        return action;
    }

    public static void main(String[] args){
        Action action = generateAction(ActionType.EMAIL, "sam", "haha");
        action.sendMessage();

    }
}
