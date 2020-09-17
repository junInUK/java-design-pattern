package com.design.pattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class NormalCriteria implements Criteria {

    @Override
    public List<Event> meetCriteria(List<Event> events) {
        List<Event> normalEvents = new ArrayList<Event>();
        for(Event event: events){
            if(event.getLevel() == EventType.NORMAL){
                normalEvents.add(event);
            }
        }
        return normalEvents;
    }
}
