package Armando.OnlineStore.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static Armando.OnlineStore.Utils.Constants.*;

@RestController
@RequestMapping(value = VER_API + "welcome", consumes = {"text/plain", "application/json", "application/json;charset=UTF-8", "application/x-www-form-urlencoded", "*/*"})
public class WelcomeController {

    @GetMapping(value = "/hello")
    public String welcome(){
        return "Hello, Welcome to my Online store!";
    }

    @GetMapping(value = "good_bye")
    public String sayGoodBye() {return "good bye amigo!";}
}
