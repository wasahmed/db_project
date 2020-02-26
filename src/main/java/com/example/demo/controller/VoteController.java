package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VoteController {
    @RequestMapping("vote")
    public ModelAndView vote() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("vote");
        return mv;
    }
}
