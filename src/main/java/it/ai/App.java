package it.ai;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Event event1=new Event();
        // // event1.eventName="Simpo2k25";
        // event1.setEventName("Sympo@k25");
        // event1.setEventDate(LocalDate.now());
        // event1.setEventType("Debugging");
        // System.out.println(event1.getEventName());
        // Event event2 = new Event("ItVictor2k24","PPT",LocalDate.now());
        // System.out.println(event2);
        Scanner scanner = new Scanner(System.in);
        Oraganizer oraganizer = new Oraganizer();
        System.out.println("-------------Welcome to DGCT---------");
        do{
            System.out.println("1. Plan Event\n2.Enroll\n3.Declare\n4.View\nAny to logout");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name, type, department");
                    Event event = new Event(scanner.next(),scanner.next(),LocalDate.now(),scanner.next());
                    oraganizer.planEvent(event);
                    break;
                case 2:
                    System.out.println("Enter the event name and name of participant ");
                    oraganizer.enrollParticipants(scanner.next(), scanner.next());
                    break;
                case 3:
                    System.out.println("Enter the event name , winner and runner");
                    oraganizer.declareWinnerRunner(scanner.next(), scanner.next(), scanner.next());
                    break;
                case 4:
                    System.out.println("Department name");
                    List<Event> filtered = oraganizer.viewByDepartment(scanner.next());
                    System.out.println(filtered);
                    break;
                default:
                    return;
            }
        }while(true);
    }
}
