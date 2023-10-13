package com.example.kino.repositories;

import com.example.kino.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, String>
{
    List<Seat> findByScheduleIdAndScreenId(Long scheduleId, Long screenId);
}
