package com.example.kino.controller;

import com.example.kino.model.Schedule;
import com.example.kino.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ScheduleRestController
{
    @Autowired
    ScheduleRepository scheduleRepository;

    @GetMapping("/getschedule")
    public List<Schedule> getSchedule(@RequestParam(name = "scheduleId")int scheduleId) {
        List<Schedule> lstSchedule = scheduleRepository.findByScheduleId(scheduleId);
        return lstSchedule;
    }
}
