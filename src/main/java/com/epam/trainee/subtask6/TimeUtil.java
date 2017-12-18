package com.epam.trainee.subtask6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public final class TimeUtil {

    public static LocalTime getDifferenceBetween(LocalTime time1, LocalTime time2) {
        if (time1 == null || time2 == null) {
            return null;
        }

        int hours = (int) ChronoUnit.HOURS.between(time1, time2);
        int minutes = (int) ChronoUnit.MINUTES.between(time1, time2);
        int seconds = (int) ChronoUnit.SECONDS.between(time1, time2);
        int nanos = (int) ChronoUnit.NANOS.between(time1, time2);
        return LocalTime.of(hours, minutes, seconds, nanos);
    }

    public static long millisecondsToSeconds(long mills) {
        return mills / 1000;
    }
}
