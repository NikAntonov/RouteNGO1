package com.example.routengo1.model;

/**
 * Created by megaman on 24.01.2017.
 */

public class Event extends Unit{

    private Place place;
    private Festival festival;

    public Event(String title, String description) {
        super(title, description);
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }
}
