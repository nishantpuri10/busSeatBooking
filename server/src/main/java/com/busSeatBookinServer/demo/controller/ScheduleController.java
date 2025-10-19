package com.busSeatBookinServer.demo.controller;

import java.net.http.HttpResponse.ResponseInfo;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busSeatBookinServer.demo.model.Schedule;
import com.busSeatBookinServer.demo.service.ScheduleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/schedules")
@RestController
@CrossOrigin(origins = "*")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    /// get the available schedules
    @GetMapping("/search")
    public  ResponseEntity<List<Schedule>> getBusSchedules(@RequestParam("source") String source, @RequestParam("destination") String destination,
            @RequestParam("departureTime") String departureTime,
            @RequestParam("arrivalTime") String arrivalTime) {
        return ResponseEntity.ok(scheduleService.getSchedulesBetween(source,destination,departureTime,arrivalTime));
    }

}
