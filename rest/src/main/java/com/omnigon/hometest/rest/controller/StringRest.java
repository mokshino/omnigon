package com.omnigon.hometest.rest.controller;

import com.omnigon.hometest.api.StringService;
import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;
import com.omnigon.hometest.rest.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * String rest.
 */
@RestController
@RequestMapping("strings")
public class StringRest {

    @Autowired
    private StringService stringService;

    /**
     * Sort rest response.
     *
     * @param request the request
     * @return the rest response
     */
    @PostMapping("/sort")
    public RestResponse<StringResponse> sort(StringRequest request) {
        return RestResponse.ok(stringService.sort(request));
    }
}
