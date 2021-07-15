package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        String pattern = "Hello {0} welcome";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String value = messageFormat.format(new Object[]{"Kusmambang"});
        System.out.println(value);
    }

    @Test
    void testMessageFormatBundle() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        String pattern = bundle.getString("welcome");
        MessageFormat messageFormat = new MessageFormat(pattern);
        String value = messageFormat.format(new Object[]{"Kusmambang"});
        System.out.println(value);
    }
}
