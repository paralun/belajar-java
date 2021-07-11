package com.paralun.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("One");

        Set<String> mutable = new HashSet<>();
        mutable.add("James");
        mutable.add("Kusmambang");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("James", "Kusmambang", "Ginting");
    }
}
