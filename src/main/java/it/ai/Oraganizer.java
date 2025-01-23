package it.ai;

import java.util.ArrayList;
import java.util.List;

public class Oraganizer {
    private List<Event> dgctEvents = new ArrayList<>();
    public void planEvent(Event event){
        dgctEvents.add(event);
        System.out.println(event.getEventName()+" has planned");
    }
    public void enrollParticipants(String eventName, String participant){
        dgctEvents = dgctEvents.stream().map(obj->{
            if(obj.getEventName().equalsIgnoreCase(eventName)&&
            obj.getEventWinner()==null&&obj.getEventRunner()==null){
                obj.getEventParticipants().add(participant);
                System.out.println(participant+" has added to "+eventName);
            }
            return obj;
        }).toList();
    }
    public void declareWinnerRunner(String eventName, String winner, String runner){
        dgctEvents = dgctEvents.stream().map(obj->{
            if(obj.getEventName().equalsIgnoreCase(eventName)
            &&obj.getEventWinner()==null&&obj.getEventRunner()==null&&
            obj.getEventParticipants().contains(winner)&&
            obj.getEventParticipants().contains(runner)){
                obj.setEventWinner(winner);obj.setEventRunner(runner);
                System.out.println("Declared "+winner+" and "+runner);
            }
            return obj;
        }).toList();
    }
    public List<Event> viewByDepartment(String department){
        return dgctEvents.stream().filter(obj->{
            return obj.getEventDepartment().equalsIgnoreCase(department);
        }).toList();
    }
}
