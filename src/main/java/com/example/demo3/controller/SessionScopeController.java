package com.example.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-scope")
public class SessionScopeController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "session-scope-form";
    }

    @RequestMapping("/input-name")
    public String inputName(String name){ //メソッド名は自由
            session.setAttribute("name", name);
            return "result-session-scope1";
    }

    @RequestMapping("/to-page1")
    public String toPage1(String name){
        return "result-session-scope1";
    }

    @RequestMapping("/to-page2")
    public String toPage2(String name){
        return "result-session-scope2";
    }

    @RequestMapping("/to-page3")
    public String toPage3(String name){
        return "result-session-scope3";
    }

    

}
