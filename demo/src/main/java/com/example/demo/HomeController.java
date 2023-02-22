package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/home/*") // WEB-INF/view/???????.jsp
public class HomeController {

    @GetMapping("index")
    public String index() {
        log.info("index call");
        return "home/index";
    }

    @GetMapping("index2")
    public String index2() {
        log.info("index2 call");
        return "redirect:index.jsp";
    }
}
