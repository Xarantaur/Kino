package com.example.kino.controller;

import com.example.kino.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ScheduleRestController
{
    @Autowired
    ScheduleRepository scheduleRepository;
}
