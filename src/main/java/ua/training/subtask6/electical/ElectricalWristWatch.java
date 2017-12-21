package ua.training.subtask6.electical;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ElectricalWristWatch extends ElectricalClock {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("hh-mm-ss");

    public ElectricalWristWatch(LocalTime currentTime) {
        super(currentTime);
    }

    @Override
    public String formatTime() {
        return "Wrist watch: " + TIME_FORMATTER.format(currentTime);
    }
}
