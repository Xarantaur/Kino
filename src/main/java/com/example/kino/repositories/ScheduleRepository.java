package com.example.kino.repositories;

import com.example.kino.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, String>
{

}
