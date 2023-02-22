package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestHomeController {

    @GetMapping("/home")
    public String home() {

        log.warn("warn");
        log.error("error");
        log.debug("debug mode");
        log.info("info");
        return "spring gradle test!!";
    }

}
