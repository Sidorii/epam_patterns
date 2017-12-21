package ua.training.subtask6.mechanical;

import java.time.LocalTime;

public class MechanicalWristWatch extends MechanicalClock {
    public MechanicalWristWatch(LocalTime time) {
        super(time);
    }

    @Override
    protected String formatTime() {
        return String.format("Wrist watch: hrs(%d), mns(%s), sec(%s)",
                convertAMHour(time.getHour()),
                convertSecOrMinToAM(time.getMinute()),
                convertSecOrMinToAM(time.getSecond()));
    }
}
