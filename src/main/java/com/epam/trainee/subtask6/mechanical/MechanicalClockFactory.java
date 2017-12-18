package com.epam.trainee.subtask6.mechanical;

import com.epam.trainee.subtask6.AbstractClockFactory;
import com.epam.trainee.subtask6.Clock;

import java.time.LocalTime;

public class MechanicalClockFactory implements AbstractClockFactory {
    @Override
    public Clock createWallsClock() {
        return new MechanicalWallClock(LocalTime.now());
    }

    @Override
    public Clock createTableClock() {
        return new MechanicalTableClock(LocalTime.now());
    }

    @Override
    public Clock createWristWatch() {
        return new MechanicalWristWatch(LocalTime.now());
    }
}
