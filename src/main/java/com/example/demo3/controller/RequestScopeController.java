package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestScope")
public class RequestScopeController {

    @RequestMapping("")
    public String index(){
        return "request-scope-form";
    }

    @RequestMapping("/input-name")
    public String inputName(String name, Model model){//modelクラスは定型　、クイックフィックスで修正
        model.addAttribute("hogehoge", name);
        return "result-request-scope";//これでスコープに値が入る
    }

}
