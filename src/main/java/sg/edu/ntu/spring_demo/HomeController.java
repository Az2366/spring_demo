package sg.edu.ntu.spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody
@RestController // @Controller + @ResponseBody
public class HomeController {

    // For server side rendered HTML pages, useful when you don't want your users to
    // download script bundles, so this will load pages faster. Especially if they
    // have a slow connection or slow devices
    // @GetMapping("/home")
    // public String home(Model model) {

    // String message = "Hello World!";
    // model.addAttribute("message", message);
    // return "home";
    // }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

}
