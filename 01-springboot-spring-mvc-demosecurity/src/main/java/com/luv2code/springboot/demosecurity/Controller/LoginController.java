package com.luv2code.springboot.demosecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return"fancy-Login";
    }

    //add request mapping for acces denied
    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        return"access-denied";
    }


}
