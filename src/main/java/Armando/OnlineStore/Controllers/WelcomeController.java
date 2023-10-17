package Armando.OnlineStore.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/welcome", consumes = {"text/plain", "application/json", "application/json;charset=UTF-8", "application/x-www-form-urlencoded", "*/*"})
public class WelcomeController {

    @GetMapping(value = "/hello")
    public String welcome(){
        return "Hello, Welcome to my Online store!";
    }
}
