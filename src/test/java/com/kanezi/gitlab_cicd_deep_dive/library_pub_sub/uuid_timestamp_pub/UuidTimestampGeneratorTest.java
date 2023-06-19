package com.kanezi.gitlab_cicd_deep_dive.library_pub_sub.uuid_timestamp_pub;


import com.kanezi.gitlab_cicd_deep_dive.library_pub_sub.UuidTimestampGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UuidTimestampGeneratorTest {

    @Test
    void generatesUniqueValues() {
        String firstValue = UuidTimestampGenerator.generate();
        String secondValue = UuidTimestampGenerator.generate();

        assertNotEquals(firstValue, secondValue);

    }

}