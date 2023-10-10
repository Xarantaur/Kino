package com.example.kino.controller;

import com.example.kino.model.Schedule;
import com.example.kino.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ScheduleRestController
{
    @Autowired
    ScheduleRepository scheduleRepository;

    @GetMapping("/schedule/{movieid}")
    public List<Schedule> getScheduleForMovie(@PathVariable int movieid)
    {
        List<Schedule> schedules = scheduleRepository.findByMovieId(movieid);
        return schedules;
    }
}
