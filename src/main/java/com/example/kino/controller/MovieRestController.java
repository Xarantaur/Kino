package com.example.kino.controller;

import com.example.kino.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MovieRestController
{
    @Autowired
    MovieRepository movieRepository;



}
