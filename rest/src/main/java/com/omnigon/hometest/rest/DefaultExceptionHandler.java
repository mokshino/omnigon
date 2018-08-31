package com.omnigon.hometest.rest;

import com.google.common.base.Throwables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Default exception handler.
 *
 * @author Anton Mokshyn.
 */
@RestControllerAdvice
public final class DefaultExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultExceptionHandler.class);

    /**
     * On server exception rest response.
     *
     * @param e the exception
     * @return the REST response
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RestResponse onServerException(Exception e) {
        LOG.error("Internal server error while processing request", e);
        String errorMessage = Throwables.getStackTraceAsString(e);
        return new RestResponse(new RestResponseStatus(RestResponseStatusCode.ERROR, errorMessage));
    }

}