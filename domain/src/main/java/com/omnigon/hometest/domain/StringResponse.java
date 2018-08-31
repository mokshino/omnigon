package com.omnigon.hometest.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * String response.
 *
 * @author Anton Mokshyn.
 */
public class StringResponse {

    private String string;
    private Integer longestWord;

    /**
     * Instantiates a new String response.
     */
    public StringResponse() {
    }

    /**
     * Instantiates a new String response.
     *
     * @param string      the string
     * @param longestWord the longest word
     */
    public StringResponse(String string, Integer longestWord) {
        this.string = string;
        this.longestWord = longestWord;
    }

    /**
     * Gets string.
     *
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * Sets string.
     *
     * @param string the string
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Gets longest word.
     *
     * @return the longest word
     */
    public Integer getLongestWord() {
        return longestWord;
    }

    /**
     * Sets longest word.
     *
     * @param longestWord the longest word
     */
    public void setLongestWord(Integer longestWord) {
        this.longestWord = longestWord;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE, false);
    }
}
