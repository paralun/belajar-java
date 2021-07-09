package com.paralun.exceptions;

public class ValidationUtil {

    public static void validate(String name) throws ValidateException, NullPointerException {
        if (name == null) {
            throw new NullPointerException("Name is null");
        }else if (name.isEmpty()) {
            throw new ValidateException("Name not empty");
        }
    }
}
