package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo3.form.CalcReserve;

@Controller
@RequestMapping("/calc")
public class CalcController {

    @RequestMapping("")
    public String index(){
        return "calc";
    }

    @RequestMapping("/answer-calc")
    public String inputString(CalcReserve calcReserve){
        System.out.println(calcReserve.getSum());
        return "result-calc-form";

    }
    







}
