package com.example.routengo1.model;

import java.util.List;

/**
 * Created by megaman on 24.01.2017.
 */

public class Place extends EventUnit{

    private List<Event> eventList;

    public Place(String title, String description, List<Event> eventList, List<Event> eventList1) {
        super(title, description, eventList);
        this.eventList = eventList1;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
