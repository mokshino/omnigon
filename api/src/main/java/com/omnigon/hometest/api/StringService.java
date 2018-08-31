package com.omnigon.hometest.api;

import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;

/**
 * String service.
 *
 * @author Anton Mokshyn.
 */
public interface StringService {
    /**
     * Sort string response.
     *
     * @param request the string request
     * @return the string response
     */
    StringResponse sort(StringRequest request);
}
