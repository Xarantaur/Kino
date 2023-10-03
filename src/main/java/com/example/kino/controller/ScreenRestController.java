package com.example.kino.controller;

import com.example.kino.repositories.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ScreenRestController
{
    @Autowired
    ScreenRepository screenRepository;
}
