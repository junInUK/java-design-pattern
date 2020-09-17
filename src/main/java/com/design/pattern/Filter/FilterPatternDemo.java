package com.design.pattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args){
        List<Event> events = new ArrayList<Event>();

        events.add(new Event(1,EventType.DANGEROUS, "s1", "15-09-2020"));
        events.add(new Event(2,EventType.DANGEROUS, "s2", "15-09-2020"));
        events.add(new Event(3,EventType.WARNING,"s2","14-09-2020"));
        events.add(new Event(4,EventType.WARNING,"s3","16-09-2020"));
        events.add(new Event(5,EventType.NORMAL,"s4","15-09-2020"));
        events.add(new Event(6,EventType.NORMAL,"s5","14-09-2020"));
        events.add(new Event(7,EventType.NORMAL,"s6","15-09-2020"));

        Criteria dangerous = new DangerousCriteria();
        Criteria warning = new WarningCriteria();
        Criteria normal = new NormalCriteria();

        System.out.println("Dangerous Events:");
        printEvents(dangerous.meetCriteria(events));

        System.out.println("Warning Events");
        printEvents(warning.meetCriteria(events));

        System.out.println("Normal Events");
        printEvents(normal.meetCriteria(events));

        doActionEvents(events);
    }

    public static void printEvents(List<Event> events){
        for(Event event: events){
            System.out.println(event.toString());
        }
    }

    public static void doActionEvents(List<Event> events){
        for(Event event: events){
            event.doAction("sam");
        }
    }
}
