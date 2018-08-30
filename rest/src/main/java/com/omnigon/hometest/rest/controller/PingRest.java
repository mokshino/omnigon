package com.omnigon.hometest.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anton Mokshyn.
 */
@RestController
public class PingRest {

    @RequestMapping("/ping")
    public RestResponse ping() {
        return RestResponse.ok();
    }

}
