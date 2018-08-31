package com.omnigon.hometest.rest;

/**
 * REST response.
 *
 * @param <T> the type parameter
 * @author Anton Mokshyn.
 */
public class RestResponse<T> {

    private final RestResponseStatus status;
    private final T result;

    /**
     * Instantiates a new Rest response.
     *
     * @param status the status
     * @param result the result
     */
    public RestResponse(RestResponseStatus status, T result) {
        this.status = status;
        this.result = result;
    }

    /**
     * Instantiates a new Rest response.
     *
     * @param status the status
     */
    public RestResponse(RestResponseStatus status) {
        this.status = status;
        this.result = null;
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
     * Gets result.
     *
     * @return the result
     */
    public T getResult() {
        return result;
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
