package com.bespalov.config;

import com.bespalov.repository.MessagesRepository;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Create class Messages and implements {@link MessagesRepository}
 * version 1.0
 */
public class Messages implements MessagesRepository {

    private Logger logger = Logger.getLogger(Messages.class.getName());

    //Get message from resource bundle
    public String getResult(String timeOfDate, ResourceBundle resourceBundle) {
        String line = String.format("message.%s", timeOfDate);
        String msg = resourceBundle.getString(line);
        logger.info(resourceBundle.getString("message.evening"));
        return msg;
    }
}
