package com.paralun.enums;

public enum Level2 {
    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
