package com.epam.trainee.subtask6.electical;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ElectricalWallClock extends ElectricalClock {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("kk:mm:ss");

    public ElectricalWallClock(LocalTime currentTime) {
        super(currentTime);
    }

    @Override
    public String formatTime(){
        return "Wall clock: " + TIME_FORMATTER.format(currentTime);

    }
}
