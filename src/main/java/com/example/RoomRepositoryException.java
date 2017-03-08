package com.example;


public class RoomRepositoryException extends RuntimeException {

    public RoomRepositoryException() {
    }

    public RoomRepositoryException(String message) {
        super(message);
    }

    public RoomRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoomRepositoryException(Throwable cause) {
        super(cause);
    }

    public RoomRepositoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
