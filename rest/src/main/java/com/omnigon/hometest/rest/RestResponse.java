package com.omnigon.hometest.rest;

/**
 * REST response.
 *
 * @param <T> the type parameter
 * @author Anton Mokshyn.
 */
public class RestResponse<T> {

    private final RestResponseStatus status;
    private final T content;

    /**
     * Instantiates a new Rest response.
     *
     * @param status  the status
     * @param content the content
     */
    public RestResponse(RestResponseStatus status, T content) {
        this.status = status;
        this.content = content;
    }

    /**
     * Instantiates a new Rest response.
     *
     * @param status the status
     */
    public RestResponse(RestResponseStatus status) {
        this.status = status;
        this.content = null;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public RestResponseStatus getStatus() {
        return status;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public T getContent() {
        return content;
    }

    /**
     * Ok rest response.
     *
     * @return the rest response
     */
    public static RestResponse ok() {
        return new RestResponse<>(new RestResponseStatus(RestResponseStatusCode.OK), null);
    }

    /**
     * Ok rest response.
     *
     * @param <E> the type parameter
     * @param obj the obj
     * @return the rest response
     */
    public static <E> RestResponse<E> ok(E obj) {
        return new RestResponse<>(new RestResponseStatus(RestResponseStatusCode.OK), obj);
    }

}
