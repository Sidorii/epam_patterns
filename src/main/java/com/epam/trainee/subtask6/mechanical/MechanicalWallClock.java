package com.epam.trainee.subtask6.mechanical;

import java.time.LocalTime;

public class MechanicalWallClock extends MechanicalClock {
    public MechanicalWallClock(LocalTime time) {
        super(time);
    }

    @Override
    protected String formatTime() {
        return String.format("%d-(%s)-(%s)",
                convertAMHour(time.getHour()),
                convertSecOrMinToAM(time.getMinute()),
                convertSecOrMinToAM(time.getSecond()));
    }
}
