package crud.bt.dgct_ait_fsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
