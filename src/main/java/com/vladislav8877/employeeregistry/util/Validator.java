package com.vladislav8877.employeeregistry.util;

public class Validator {
    public static void checkString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Ошибка: поле \"" + fieldName +"\" не может быть пустым!");
        }
    }

    public static void checkAmount(double amount, String fieldName) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Ошибка: поле \"" + fieldName +"\" должно быть больше нуля!");
        }
    }
}