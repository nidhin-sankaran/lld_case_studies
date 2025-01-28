package org.example.models;

import java.util.List;

public class Screen {
    private long id;
    private String name;
    private long theatreId;
    private List<ScreenType> screenType;
    List<Seat> seats;
}
