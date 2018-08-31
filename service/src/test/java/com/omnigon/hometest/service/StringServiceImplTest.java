package com.omnigon.hometest.service;

import com.omnigon.hometest.api.StringService;
import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;
import com.omnigon.hometest.domain.StringResponseItem;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringServiceImplTest {

    private StringService stringService = new StringServiceImpl();

    @Test
    public void testSort() {

        StringRequest request = new StringRequest();

        request.setStrings(Arrays.asList(
                "Sound boy proceed to blast into the galaxy",
                "Go back rocket man into the sky you'll see",
                "Hear it all the time, come back rewind",
                "Aliens are watching up in the sky",
                "Sound boy process to blast into the galaxy",
                "No one gonna harm you",
                "They all want you to play I watch the birds of prey"));

        StringResponse response = stringService.sort(request);

        List<StringResponseItem> result = response.getResult();

        assertEquals(5, result.size());

        assertEquals("Aliens are watching up in the sky", result.get(0).getString());
        assertEquals(8, result.get(0).getLongestWord().intValue());

        assertEquals("Sound boy process to blast into the galaxy", result.get(1).getString());
        assertEquals(7, result.get(1).getLongestWord().intValue());

        assertEquals("Sound boy proceed to blast into the galaxy", result.get(2).getString());
        assertEquals(7, result.get(2).getLongestWord().intValue());

        assertEquals("Go back rocket man into the sky you'll see", result.get(3).getString());
        assertEquals(6, result.get(3).getLongestWord().intValue());

        assertEquals("Hear it all the time, come back rewind", result.get(4).getString());
        assertEquals(6, result.get(4).getLongestWord().intValue());
    }

    @Test
    public void testSortEmpty() {
        StringRequest request = new StringRequest();

        request.setStrings(Collections.emptyList());

        StringResponse response = stringService.sort(request);

        List<StringResponseItem> result = response.getResult();

        assertEquals(0, result.size());
    }

    @Test
    public void testSortEmptyString() {
        StringRequest request = new StringRequest();

        request.setStrings(Collections.singletonList(""));

        StringResponse response = stringService.sort(request);

        List<StringResponseItem> result = response.getResult();

        assertEquals(1, result.size());

        assertEquals("", result.get(0).getString());
        assertEquals(0, result.get(0).getLongestWord().intValue());

    }
}