package com.omnigon.hometest.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * String request.
 *
 * @author Anton Mokshyn.
 */
public class StringRequest {

    private List<String> strings;

    /**
     * Gets strings.
     *
     * @return the strings
     */
    public List<String> getStrings() {
        return strings;
    }

    /**
     * Sets strings.
     *
     * @param strings the strings
     */
    public void setStrings(List<String> strings) {
        this.strings = strings;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE, false);
    }
}
