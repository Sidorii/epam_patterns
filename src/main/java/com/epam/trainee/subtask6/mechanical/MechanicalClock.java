package com.epam.trainee.subtask6.mechanical;

import com.epam.trainee.subtask6.Clock;
import com.epam.trainee.subtask6.TimeUtil;

import java.time.LocalTime;

public abstract class MechanicalClock implements Clock {

    protected LocalTime time;
    private long baseMills;

    public MechanicalClock(LocalTime time) {
        this.time = time;
        baseMills = System.currentTimeMillis();
    }

    @Override
    public final String getTime() {
        long millsPassed = System.currentTimeMillis() - baseMills;
        long secondsPassed = TimeUtil.millisecondsToSeconds(millsPassed);
        time.plusSeconds(secondsPassed);
        return "Mechanical: " + formatTime();
    }

    protected abstract String formatTime();

    @Override
    public void setTime(LocalTime timestamp) {
        this.time = timestamp;
    }

    protected int convertAMHour(int hour) {
        if (hour > 12) {
            hour -= 12;
        }
        return hour;
    }

    protected float convertSecOrMinToAM(int timestamp) {
        return ((float)timestamp / 5);
    }
}
