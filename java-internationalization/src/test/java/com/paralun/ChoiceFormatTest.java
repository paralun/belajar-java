package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {

    @Test
    void testChoiceFormat() {
        String pattern = "-1#negatif | 0#kosong | 1#satu |1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(2));
    }

    @Test
    void testChoiceFormatLocale() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        String pattern = bundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format1 = messageFormat.format(new Object[]{-1000000});
        String format2 = messageFormat.format(new Object[]{0});
        String format3 = messageFormat.format(new Object[]{1000000});

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
}
