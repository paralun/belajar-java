package com.paralun.exceptions;

public class ValidateApp {
    public static void main(String[] args) {

        try {
            ValidationUtil.validate("");
            System.out.println("Validation Success");
        } catch (NullPointerException e) {
            System.out.println("Error Null: " + e.getMessage());
        } catch (ValidateException ve) {
            System.out.println("Error: " + ve.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
