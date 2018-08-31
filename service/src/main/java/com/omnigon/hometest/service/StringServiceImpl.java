package com.omnigon.hometest.service;

import com.omnigon.hometest.api.StringService;
import com.omnigon.hometest.domain.StringRequest;
import com.omnigon.hometest.domain.StringResponse;
import com.omnigon.hometest.domain.StringResponseItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.springframework.util.Assert.notNull;

/**
 * String service implementation.
 *
 * @author Anton Mokshyn.
 */
@Service
public class StringServiceImpl implements StringService {

    private static final int SORT_LIMIT = 5;

    @Override
    public StringResponse sort(StringRequest request) {

        notNull(request.getStrings(), "'strings' cannot be null");

        List<StringResponseItem> result = request.getStrings().stream()
                .map(string -> new StringResponseItem(string,
                        Arrays.stream(string.split(" "))
                                .map(s1 -> s1.replaceAll("\\p{P}", "")) // remove punctuation
                                .map(String::length).reduce(0, Math::max)))
                .sorted(getStringResponseItemComparator())
                .limit(SORT_LIMIT)
                .collect(Collectors.toList());


        return new StringResponse(result);
    }

    private Comparator<StringResponseItem> getStringResponseItemComparator() {
        return (s1, s2) -> isLongestWordEquals(s1, s2) ? compareByString(s1, s2) : compareByLongestWord(s1, s2);
    }

    private boolean isLongestWordEquals(StringResponseItem s1, StringResponseItem s2) {
        return s1.getLongestWord().equals(s2.getLongestWord());
    }

    private int compareByLongestWord(StringResponseItem s1, StringResponseItem s2) {
        return s2.getLongestWord().compareTo(s1.getLongestWord());
    }

    private int compareByString(StringResponseItem s1, StringResponseItem s2) {
        return s1.getString().length() >= s2.getString().length() ?
                s2.getString().compareTo(s1.getString()) :
                s1.getString().compareTo(s2.getString());
    }

}
