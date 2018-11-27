package com.bespalov;

import com.bespalov.config.DayTime;
import com.bespalov.config.Messages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Create main class {@link Main}
 * author Bespalov Andrew
 * version 1.0
 */
public class Main {
    private static Messages messages = new Messages();
    private static DayTime dayTime = new DayTime();
    //  Initialize now date and converted to hour
    private static final String nowDate = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
    //  Init messages resources
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("Message", Locale.getDefault());

    public static void main(String[] args) {

        System.out.println(messages.getResult(dayTime.getTimesOfDay(nowDate), resourceBundle));
    }
}
