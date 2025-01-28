package org.example.models;

import java.util.List;

public class Booking {
    private long bookingId;
    private long showId;
    private long userId;
    private BookingStatus status;
    private List<ShowSeat> showSeats;
    private String time;
    List<Payemnt> payment;
}
