package com.Girish1845.airline.db;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder(toBuilder = true)
public class TicketInfo {
    private Long id;
    private Long flightId;
    private LocalDate travelDate;
    private String passengerName;
    private String bookingReference;
}
