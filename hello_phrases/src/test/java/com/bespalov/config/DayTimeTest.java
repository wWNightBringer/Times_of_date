package com.bespalov.config;

import org.junit.After;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class DayTimeTest {
    private DayTime dayTime = new DayTime();;

    @org.junit.jupiter.api.Test
    void getTimesOfDay() {
        String expect = "Incorrect time";
        assertEquals(expect,dayTime.getTimesOfDay("56"));
    }

}