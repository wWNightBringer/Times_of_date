package com.bespalov.repository;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public interface MessagesRepository {
    String getResult(String dayTime, ResourceBundle resourceBundle);
}
