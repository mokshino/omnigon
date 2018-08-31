package com.omnigon.hometest.rest.controller;

import com.omnigon.hometest.api.StringService;
import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StringRestTest {

    private static final String TEST_REQ = "{\"strings\": [" +
            "\"Sound boy proceed to blast into the galaxy\"," +
            "\"Go back rocket man into the sky you'll see\"," +
            "\"Hear it all the time, come back rewind\"," +
            "\"Aliens are watching up in the sky\"," +
            "\"Sound boy process to blast into the galaxy\"," +
            "\"No one gonna harm you\"," +
            "\"They all want you to play I watch the birds of prey\"" +
            "]}";

    private static final String TEST_RES = "{\"status\":{\"code\":\"OK\",\"message\":null}," +
            "\"result\":[{\"string\":\"test\",\"longestWord\":10}]}";

    @MockBean
    private StringService stringService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void sort() throws Exception {
        given(stringService.sort(any(StringRequest.class)))
                .willReturn(Collections.singletonList(new StringResponse("test", 10)));

        mvc.perform(post("/strings/sort")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(TEST_REQ))
                .andExpect(status().isOk())
                .andExpect(content().string(TEST_RES));

    }
}