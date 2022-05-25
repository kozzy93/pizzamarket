package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("confirmation")
public class ConfirmationController {

    @GetMapping
    public String showConfirmationPage(){
        return "confirmationPage";
    }
}
