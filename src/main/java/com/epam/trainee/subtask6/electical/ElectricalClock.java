package com.epam.trainee.subtask6.electical;

import com.epam.trainee.subtask6.Clock;
import com.epam.trainee.subtask6.TimeUtil;

import java.time.LocalTime;

public abstract class ElectricalClock implements Clock {

    protected LocalTime currentTime;
    private LocalTime timestamp;

    public ElectricalClock(LocalTime currentTime) {
        this.currentTime = currentTime;
        timestamp = LocalTime.now();
    }

    public final String getTime() {
        LocalTime now = LocalTime.now();
        LocalTime diffTime = TimeUtil.getDifferenceBetween(timestamp, now);
        timestamp = now;

        currentTime.plusHours(diffTime.getHour());
        currentTime.plusMinutes(diffTime.getMinute());
        currentTime.plusSeconds(diffTime.getSecond());
        currentTime.plusNanos(diffTime.getNano());
        return "Electrical: " + formatTime();
    }

    protected abstract String formatTime();

    @Override
    public void setTime(LocalTime timestamp) {
        this.currentTime = timestamp;
    }
}
