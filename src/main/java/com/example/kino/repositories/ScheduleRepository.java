package com.example.kino.repositories;

import com.example.kino.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer>
{
    List<Schedule> findByMovie_MovieId(Integer movieId);
    List<Schedule> findByScheduleId(Integer scheduleId);
}
