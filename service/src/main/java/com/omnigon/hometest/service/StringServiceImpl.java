package com.omnigon.hometest.service;

import com.omnigon.hometest.api.StringService;
import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;
import org.springframework.stereotype.Service;

/**
 * String service implementation.
 *
 * @author Anton Mokshyn.
 */
@Service
public class StringServiceImpl implements StringService {
    @Override
    public StringResponse sort(StringRequest request) {
        return null;
    }
}
