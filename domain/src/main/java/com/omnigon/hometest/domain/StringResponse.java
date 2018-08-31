package com.omnigon.hometest.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * String response.
 *
 * @author Anton Mokshyn.
 */
public class StringResponse {

    /**
     * The Result.
     */
    private List<StringResponseItem> result;

    /**
     * Instantiates a new String response.
     */
    public StringResponse() {
    }

    /**
     * Instantiates a new String response.
     *
     * @param result the result
     */
    public StringResponse(List<StringResponseItem> result) {
        this.result = result;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public List<StringResponseItem> getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(List<StringResponseItem> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE, false);
    }
}
