package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeBundle() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        String pattern = bundle.getString("status");
        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String value = messageFormat.format(new Object[]{"Kusmambang", new Date(), 1000000});
        System.out.println(value);
    }
}
