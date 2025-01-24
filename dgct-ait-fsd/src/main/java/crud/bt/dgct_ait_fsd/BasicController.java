package crud.bt.dgct_ait_fsd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    private List<String> roles = new ArrayList<>();
    private Event event = new Event();
    private List<Event> dgctEvents = new ArrayList<>();
    public BasicController(){
        roles.add("DevOps Engineer");
        roles.add("FSD");
        roles.add("Analytics");
        event = new Event();
        event.eventDepartment="Ai&Ds";
        event.eventNme="Debug2025";
        event.eventReward=1500;
        dgctEvents.add(event);
        event = new Event();
        event.eventDepartment="IT";
        event.eventNme="PPT2025";
        event.eventReward=1000;
        dgctEvents.add(event);
        event = new Event();
        event.eventDepartment="CSE";
        event.eventNme="Hackathon";
        event.eventReward=15000;
        dgctEvents.add(event);
    }

    @GetMapping("/everything")
    public String viewEventObjects(Model model){
        model.addAttribute("today", dgctEvents);
        System.out.println(dgctEvents);
        return "viewobjects";
    }

    @GetMapping("/obj")
    public String viewObject(Model model){
        model.addAttribute("program", event);
        return "showobject";
    }

    @GetMapping("/all")
    public String viewingAll(Model model){
        model.addAttribute("jobs", roles);
        return "iterate";
    }

    @GetMapping("/print")
    public String viewingData(Model model){
        model.addAttribute("selected",roles.get(0));
        return "showdate";
    }

    // localhost:8081/
    @GetMapping("/")
    public String greeting(){
        return "index";
    }
}
