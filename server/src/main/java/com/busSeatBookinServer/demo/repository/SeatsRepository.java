package com.busSeatBookinServer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.busSeatBookinServer.demo.model.Seat;
import java.util.List;


public interface SeatsRepository extends JpaRepository<Seat,Long> {
   
    @Query("SELECT s FROM Seat s WHERE s.schedule.id = :scheduleId")
    List<Seat> findSeatsBySchedule(@Param("scheduleId")Long scheduleId);
    
} 
