package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue="Nghia")String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("prefix", "Nghia Nguyen");
        return "greeting"; // greeting.html
    }
}
