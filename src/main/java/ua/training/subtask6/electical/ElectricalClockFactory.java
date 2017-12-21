package ua.training.subtask6.electical;

import ua.training.subtask6.AbstractClockFactory;

import java.time.LocalTime;

public class ElectricalClockFactory implements AbstractClockFactory {

    public ElectricalClock createWallsClock() {
        return new ElectricalWallClock(LocalTime.now());
    }

    public ElectricalClock createTableClock() {
        return new ElectricalTableClock(LocalTime.now());
    }

    public ElectricalClock createWristWatch() {
        return new ElectricalWristWatch(LocalTime.now());
    }
}
