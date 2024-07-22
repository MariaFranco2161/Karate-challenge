package com.nttdata.challenge.util.validations;

public class Validations {

    private Validations() {
    }

    public static boolean isNotEmptyOrNull(String value) {
        return !isEmptyOrNull(value);
    }

    public static boolean isEmptyOrNull(String value) {
        return value == null || value.isEmpty();
    }
}
