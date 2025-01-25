package crud.bt.dgct_ait_fsd;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CollegeEvents {
    @Id
    private String eventName;
    private String eventDepartment;
    private List<String> eventPArticipants;
    private String eventWinner;
    private String eventRunner;
    private LocalDateTime eventDate;
    public CollegeEvents(String eventName, String eventDepartment, LocalDateTime eventDate) {
        this.eventName = eventName;
        this.eventDepartment = eventDepartment;
        this.eventDate = eventDate;
    }
    public CollegeEvents() {
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventDepartment() {
        return eventDepartment;
    }
    public void setEventDepartment(String eventDepartment) {
        this.eventDepartment = eventDepartment;
    }
    public List<String> getEventPArticipants() {
        return eventPArticipants;
    }
    public void setEventPArticipants(List<String> eventPArticipants) {
        this.eventPArticipants = eventPArticipants;
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
    public LocalDateTime getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
    
}
