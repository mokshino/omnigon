package com.omnigon.hometest.rest.controller;

/**
 * @author Anton Mokshyn.
 */
public class RestResponse<T> {

    private final RestResponseStatus status;
    private final T result;

    public RestResponse(RestResponseStatus status, T result) {
        this.status = status;
        this.result = result;
    }

    public RestResponse(RestResponseStatus status) {
        this.status = status;
        this.result = null;
    }

    public RestResponseStatus getStatus() {
        return status;
    }

    public T getResult() {
        return result;
    }

    public static RestResponse ok() {
        return new RestResponse<>(new RestResponseStatus(RestResponseStatusCode.OK), null);
    }

    public static <E> RestResponse<E> ok(E obj) {
        return new RestResponse<>(new RestResponseStatus(RestResponseStatusCode.OK), obj);
    }

}
