package com.shinta.coba.controller;

import com.shinta.coba.model.ProfileDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping ("/hai")
public class CobainController {

    @GetMapping ("")
    public ProfileDto get() {
        ProfileDto dto = new ProfileDto();
        dto.setMessages("success");
        return dto;
    }

    @GetMapping("/")
    public String getString() {
        return ("message : Success");
    }

    
}
