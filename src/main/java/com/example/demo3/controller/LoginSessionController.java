package com.example.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login-session")
public class LoginSessionController {

    @Autowired
    private HttpSession login;

    @RequestMapping("")
    public String index(){
        return "login-session-form";
    }


    @RequestMapping("/input-date")
    public String inputDate(String mailadress, String password){ 
        if ("test@example.com".equals(mailadress) && "123".equals(password)) {
            login.setAttribute("mailadress", mailadress);
            login.setAttribute("password", password);
            return "result-login";
        }
        else {
       return "login-session-form";
       
    
            
        }
    }

    @RequestMapping("/result-login")
    public String toMyPage(String mailadress, String password){
        return "login-complite";
    }


    

  

}
