package com.wjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller

@RequestMapping("/mycontroller")

public class TestCheckBox {

    @RequestMapping(method = RequestMethod.GET)

    public String form() {

        return "mycontroller";

    }

    @RequestMapping(method = RequestMethod.POST)

    public String form1(String[] interest, Model model) {

        //String a = Arrays.toString(interest);
        System.out.println(Arrays.toString(interest));
        for (String s :
                interest) {
            System.out.println(s);
        }
        //model.addAttribute("ins", a);

        return "ok";

    }

}