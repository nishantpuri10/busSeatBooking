package com.busSeatBookinServer.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.busSeatBookinServer.demo.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    
    @Query("SELECT s FROM Schedule s WHERE s.source = :source AND destination = :destination AND s.departureTime >= :departureTime AND s.arrivalTime >= :arrivalTime")
    List<Schedule> getBusSchedulesBetween(@Param("source") String source, @Param("destination") String destination,
            @Param("departureTime") LocalDateTime departureTime, @Param("arrivalTime") LocalDateTime arrivalTime);


}
