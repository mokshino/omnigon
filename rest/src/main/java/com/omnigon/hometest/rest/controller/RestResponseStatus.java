package com.omnigon.hometest.rest.controller;

/**
 * @author Anton Mokshyn.
 */
public class RestResponseStatus {

    private final RestResponseStatusCode code;
    private final String message;

    public RestResponseStatus(RestResponseStatusCode code) {
        this.code = code;
        this.message = null;
    }

    public RestResponseStatus(RestResponseStatusCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResponseStatusCode getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}