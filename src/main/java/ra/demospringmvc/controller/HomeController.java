package ra.demospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// localhost:8081/
@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    @GetMapping("")
    public String home(Model model){
        String name = "Nguyen Van A";
        model.addAttribute("name", name);
        return "home";

    }
    @GetMapping("greeting")
    public String greeting(){
        return "greeting";
    }
}
