package com.epam.trainee.subtask6.electical;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ElectricalTableClock extends ElectricalClock {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("kk:mm:ss:nnnnnnnnn");

    public ElectricalTableClock(LocalTime currentTime) {
        super(currentTime);
    }

    @Override
    public String formatTime() {
        return "Table clock: " + TIME_FORMATTER.format(currentTime);
    }
}
