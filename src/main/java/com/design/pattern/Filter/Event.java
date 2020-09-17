package com.design.pattern.Filter;

import com.design.pattern.Action.Action;
import com.design.pattern.Action.ActionType;
import com.design.pattern.Action.ShortMessageAction;

import java.sql.Time;

import static com.design.pattern.Action.Factory.generateAction;

public class Event {
    private int ID;
    private EventType level;
    private String node;
    private String time;

    public Event(int ID, EventType level, String node, String time) {
        this.ID = ID;
        this.level = level;
        this.node = node;
        this.time = time;
    }

    public int getID() {
        return ID;
    }

    public EventType getLevel() {
        return level;
    }

    public String getNode() {
        return node;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "ID=" + ID +
                ", level=" + level +
                ", node='" + node + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public void doAction(String receiver) {
        if(this.level == EventType.DANGEROUS){
            Action sm = generateAction(ActionType.SHORT_MESSAGE, receiver, this.toString());
            sm.sendMessage();
        }else if(this.level == EventType.WARNING){
            Action email = generateAction(ActionType.EMAIL, receiver, this.toString());
            email.sendMessage();
        }else if(this.level == EventType.NORMAL){
            Action email = generateAction(ActionType.EMAIL, receiver, this.toString());
            email.sendMessage();
        }
    }
}
