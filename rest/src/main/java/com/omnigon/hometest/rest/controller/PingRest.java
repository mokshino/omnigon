package com.omnigon.hometest.rest.controller;

import com.omnigon.hometest.rest.RestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ping REST.
 *
 * @author Anton Mokshyn.
 */
@RestController
public class PingRest {

    /**
     * Ping rest call.
     *
     * @return the rest response
     */
    @GetMapping("/ping")
    public RestResponse ping() {
        return RestResponse.ok();
    }

}
