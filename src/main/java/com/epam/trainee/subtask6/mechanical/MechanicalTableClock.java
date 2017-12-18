package com.epam.trainee.subtask6.mechanical;

import java.time.LocalTime;

public class MechanicalTableClock extends MechanicalClock {
    public MechanicalTableClock(LocalTime time) {
        super(time);
    }

    @Override
    protected String formatTime() {
        return String.format("Table clock: hours(%d), minutes(%d), seconds(%s)",
                time.getHour(), time.getMinute(), time.getSecond());
    }
}
