package com.omnigon.hometest.api;

import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;

import java.util.List;

/**
 * String service.
 *
 * @author Anton Mokshyn.
 */
public interface StringService {
    /**
     * Sort string response.
     *
     * @param request the strings request
     * @return the list
     */
    List<StringResponse> sort(StringRequest request);
}
