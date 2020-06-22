package com.asusoftware.ecommerce.exceptions;

public class NotFoundUserExceptions extends RuntimeException {
    public NotFoundUserExceptions() {
        super("User not found");
    }
}
