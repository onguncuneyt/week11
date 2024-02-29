package com.cinoxil.denemeSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/")
public class TestController {
    @GetMapping("/")
    public String home(){
        return "Anasayfa";
    }

    @GetMapping("/about")
    public String about(){
        return "Hakkımızda";
    }

    @GetMapping ("/user/{userId}/{userName}")
    public String getUser(@PathVariable("userId") int user_id,@PathVariable("userName") String userName) {
        return "User id : " + user_id + " Username : " + userName;
    }
}
