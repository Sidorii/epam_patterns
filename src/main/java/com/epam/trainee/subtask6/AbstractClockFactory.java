package com.epam.trainee.subtask6;

public interface AbstractClockFactory {

    Clock createWallsClock();

    Clock createTableClock();

    Clock createWristWatch();
}
