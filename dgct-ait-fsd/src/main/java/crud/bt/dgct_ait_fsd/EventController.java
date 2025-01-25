package crud.bt.dgct_ait_fsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class EventController {
    @Autowired
    CollegeRepo collegeRepo;
    @GetMapping("/")
    public String sendNewPAge(Model model){
        CollegeEvents events=new CollegeEvents();
        model.addAttribute("object", events);
        return "new";
    }
    @PostMapping("/")
    public String receiveObject(CollegeEvents collegeEvents){
        System.out.println(collegeEvents.getEventName()+" "+collegeEvents.getEventDepartment()+" "+collegeEvents.getEventDate());
        collegeRepo.save(collegeEvents);
        return "redirect:/mvc/";
    }
    @GetMapping("/enroll")
    public String showEnroll(){
        return "register";
    }
    @PostMapping("/enroll")
    public String add(@RequestParam String eventName, @RequestParam String eventParticipant){
        CollegeEvents collegeEvents = collegeRepo.findById(eventName).get();
        if(collegeEvents!=null){
            if(collegeEvents.getEventRunner()==null&&collegeEvents.getEventWinner()==null){
                collegeEvents.getEventPArticipants().add(eventParticipant);
                collegeRepo.save(collegeEvents);
                return "register";
            }
        }
        return "redirect:/";
    }
    @GetMapping("/declare/{name}")
    public String toBeAnnounced(@PathVariable String name, Model model){
        CollegeEvents collegeEvents = collegeRepo.findById(name).get();
        if(collegeEvents!=null){
            model.addAttribute("object", collegeEvents);
            return "assign";
        }
        return "redirect:/mvc/";
    }
    @PostMapping("/declare")
    public String declaring(@RequestParam String eventName, @RequestParam String eventWinner, @RequestParam String eventRunner){
        CollegeEvents collegeEvents = collegeRepo.findById(eventName).get();
        if(collegeEvents.getEventPArticipants().contains(eventWinner)&&
        collegeEvents.getEventPArticipants().contains(eventRunner)){
            collegeEvents.setEventRunner(eventRunner);
            collegeEvents.setEventWinner(eventWinner);
            collegeRepo.save(collegeEvents);
        }
        return "redirect:/mvc/";
    }

}
