package ua.training.subtask6;

import java.time.LocalTime;

public interface Clock {

    String getTime();

    void setTime(LocalTime timestamp);
}
