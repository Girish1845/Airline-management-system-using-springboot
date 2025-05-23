package com.Girish1845.airline.db;


import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder(toBuilder = true)

public class ScheduleInfo {
    private Long id;
    private Long flightId;
    private LocalDate date;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private int availableSeats;
}
