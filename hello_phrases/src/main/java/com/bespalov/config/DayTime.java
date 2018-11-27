package com.bespalov.config;

import com.bespalov.repository.DayTimeRepository;

import java.util.logging.Logger;

/**
 * Create class Messages and implements {@link DayTimeRepository}
 * version 1.0
 */
public class DayTime implements DayTimeRepository {
    private Logger logger = Logger.getLogger(DayTime.class.getName());

    //  Get times of day (morning,day,evening or night)
    public String getTimesOfDay(String nowDate) {
        int hour = Integer.parseInt(nowDate);
        logger.info(String.valueOf(hour));
        if (hour >= 6 && hour < 9)
            return "morning";
        if (hour >= 9 && hour < 19)
            return "day";
        if (hour >= 19 && hour < 23)
            return "evening";
        if ((hour >= 23 && hour < 24) || (hour >= 0 && hour < 6))
            return "night";
        return "Incorrect time";
    }
}
