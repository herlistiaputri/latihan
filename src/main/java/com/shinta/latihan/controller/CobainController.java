package com.shinta.latihan.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.shinta.latihan.assembler.ProfileAssembler;
import com.shinta.latihan.config.DefaultResponse;
import com.shinta.latihan.model.ProfileDto;
import com.shinta.latihan.model.ProfileEntity;
import com.shinta.latihan.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping ("/hai")
public class CobainController {
    @Autowired
    private ProfileRepository repository;
    @Autowired
    private ProfileAssembler assembler;

    @PostMapping("/")
    public DefaultResponse insert (@RequestBody ProfileDto dto){
        return DefaultResponse.ok(repository.save(assembler.fromDto(dto)));
    }

    @GetMapping("/")
    public DefaultResponse get() {
        List<ProfileEntity> profileList = repository.findAll();
        List<ProfileDto> dto = profileList.stream().map(profile -> assembler.fromEntity(profile))
            .collect(Collectors.toList());
        return DefaultResponse.ok(dto);
    }
    
}
