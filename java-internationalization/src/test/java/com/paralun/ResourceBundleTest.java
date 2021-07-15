package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResource() {
        ResourceBundle bundle = ResourceBundle.getBundle("message");
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));
    }

    @Test
    void testResourceLocale() {
        Locale indonesia = new Locale("in", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("message", indonesia);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));
    }
}
