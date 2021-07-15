package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class LocaleCurrencyTest {

    @Test
    void testCurrency() {
        // ISO_4217
        Locale locale = new Locale("in", "ID");
        Currency currency = Currency.getInstance(locale);

        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getSymbol());
    }

    @Test
    void testCurrencyNumber() {
        Locale locale = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String value = numberFormat.format(1234567);
        System.out.println(value);
    }
}
