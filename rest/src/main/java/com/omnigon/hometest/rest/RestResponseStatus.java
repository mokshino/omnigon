package com.omnigon.hometest.rest;

/**
 * REST response status.
 *
 * @author Anton Mokshyn.
 */
public class RestResponseStatus {

    private final RestResponseStatusCode code;
    private final String message;

    /**
     * Instantiates a new Rest response status.
     *
     * @param code the code
     */
    public RestResponseStatus(RestResponseStatusCode code) {
        this.code = code;
        this.message = null;
    }

    /**
     * Instantiates a new Rest response status.
     *
     * @param code    the code
     * @param message the message
     */
    public RestResponseStatus(RestResponseStatusCode code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public RestResponseStatusCode getCode() {
        return code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}