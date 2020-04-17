package ru.itis.hackaton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.hackaton.dto.ResultDto;

import javax.servlet.http.HttpSession;

@Controller
public class ResultController {

    @GetMapping("/result")
    public String getResultPage(ModelMap modelMap, HttpSession session) {
        modelMap.addAttribute("result", (ResultDto) session.getAttribute("result"));
        return "result";
    }
}
