package com.dtodemo.controllers;

import com.dtodemo.dto.NumberInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    private static final Logger myLogger= LoggerFactory.getLogger(AppController.class);


    @RequestMapping("/home")
    public String showHomePage() {
       myLogger.trace("we are tracing");
       myLogger.error("logger is showing error");
       myLogger.warn("logger is warning");
       myLogger.info("fetching info");
        return "welcome-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage(NumberInfoDTO numberInfoDTO, Model model) {

        // writing the value to the properties
        // by fetching from the URL
        model.addAttribute("numberInfo", numberInfoDTO);

        return "result-page";
    }

}
