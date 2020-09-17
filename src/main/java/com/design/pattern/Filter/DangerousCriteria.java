package com.design.pattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class DangerousCriteria implements Criteria{

    @Override
    public List<Event> meetCriteria(List<Event> events) {
        List<Event> dangerousEvent = new ArrayList<Event>();
        for(Event event: events){
            if(event.getLevel() == EventType.DANGEROUS){
                dangerousEvent.add(event);
            }
        }
        return dangerousEvent;
    }
}
