package com.example.petnannydev.Classes;
import java.util.*;

public class Calendar {
    List<Event> eventList = new ArrayList<Event>();

    public boolean createEvent(int startTime, int endTime, String date, String name, String location,
                                String details/**, Color color*/, String recurrence) {
        Event e = new Event(startTime, endTime, date, name, location, details/**, color*/, recurrence);
        eventList.add(e);
        return true;
    }

    public boolean editEventStartTime(Event e, int startTime) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setStartTime(startTime);
            return true;
        }

        return false;
    }

    public boolean editEventEndTime(Event e, int endTime) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setEndTime(endTime);
            return true;
        }

        return false;
    }

    public boolean editEventDate(Event e, String date) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setDate(date);
            return true;
        }

        return false;
    }

    public boolean editEventName(Event e, String name) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setName(name);
            return true;
        }

        return false;
    }

    public boolean editEventLocation(Event e, String location) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setLocation(location);
            return true;
        }

        return false;
    }

    public boolean editEventDetails(Event e, String details) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setDetails(details);
            return true;
        }

        return false;
    }

    public boolean editEventRecurrence(Event e, String recurrence) {
        boolean check = false;
        for(int j = 0; j < eventList.size(); j++) {
            if(eventList.get(j).equals(e)) {
                check = true;
            }
        }

        if(check) {
            e.setRecurrence(recurrence);
            return true;
        }

        return false;
    }

    public boolean deleteEvent(Event e) {
       for(int j = 0; j < eventList.size(); j++) {
           if(eventList.get(j).equals(e)) {
               eventList.remove(j);
               return true;
           }
       }

       return false;
    }

    public void displayAll() {

    }

    public void displayEvent(Event e) {

    }

    public void hideEvent(Event e) {

    }
}