package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        // https://www.loc.gov/standards/iso639-2/php/code_list.php
        String language = "id";

        // ISO3166-2
        String country = "ID";

        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUS() {
        // https://www.loc.gov/standards/iso639-2/php/code_list.php
        String language = "en";

        // ISO3166-2
        String country = "US";

        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
