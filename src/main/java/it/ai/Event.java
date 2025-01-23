package it.ai;

import java.time.LocalDate;
import java.util.List;

public class Event {
    @Override
    public String toString() {
        return "Event [eventName=" + eventName + ", eventType=" + eventType + ", eventDate=" + eventDate
                + ", eventParticipants=" + eventParticipants + ", eventWinner=" + eventWinner + ", eventRunner="
                + eventRunner + ", eventDepartment=" + eventDepartment + "]";
    }
    public Event(String eventName, String eventType, LocalDate eventDate, String eventDepartment) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventDepartment = eventDepartment;
    }
    public Event() {
    }
    private String eventName;
    private String eventType;
    private LocalDate eventDate;
    private List<String> eventParticipants;
    private String eventWinner;
    private String eventRunner;
    private String eventDepartment;
    public String getEventDepartment() {
        return eventDepartment;
    }
    public void setEventDepartment(String eventDepartment) {
        this.eventDepartment = eventDepartment;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public String getEventName(){
        return eventName;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public List<String> getEventParticipants() {
        return eventParticipants;
    }
    public void setEventParticipants(List<String> eventParticipants) {
        this.eventParticipants = eventParticipants;
    }
    public String getEventWinner() {
        return eventWinner;
    }
    public void setEventWinner(String eventWinner) {
        this.eventWinner = eventWinner;
    }
    public String getEventRunner() {
        return eventRunner;
    }
    public void setEventRunner(String eventRunner) {
        this.eventRunner = eventRunner;
    }
}
