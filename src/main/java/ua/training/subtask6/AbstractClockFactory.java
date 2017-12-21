package ua.training.subtask6;

public interface AbstractClockFactory {

    Clock createWallsClock();

    Clock createTableClock();

    Clock createWristWatch();
}
