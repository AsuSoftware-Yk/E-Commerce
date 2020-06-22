package com.asusoftware.ecommerce.exceptions;

public class InvalidPasswordExceptions extends RuntimeException {
    public InvalidPasswordExceptions() {
        super("Invalid password");
    }
}
