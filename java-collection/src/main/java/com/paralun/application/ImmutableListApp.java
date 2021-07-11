package com.paralun.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("James");
        mutable.add("Kusmambang");

        List<String> immutable = Collections.unmodifiableList(mutable);

        // Error
        // immutable.add("ERROR");

        List<String> elements = List.of("James", "Kusmambang");

        // Error
        // elements.add("ERROR");
    }
}
