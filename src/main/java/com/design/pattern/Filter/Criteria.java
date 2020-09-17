package com.design.pattern.Filter;

import java.util.List;

public interface Criteria {
    public List<Event> meetCriteria(List<Event> events);
}
