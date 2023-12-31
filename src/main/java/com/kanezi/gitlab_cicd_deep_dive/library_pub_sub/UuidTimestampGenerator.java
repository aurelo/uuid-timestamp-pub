package com.kanezi.gitlab_cicd_deep_dive.library_pub_sub;

import java.time.LocalDate;
import java.util.UUID;

public class UuidTimestampGenerator {

    public static String generate() {
        return String.format("%s => %s", LocalDate.now(), UUID.randomUUID().toString());
    }
}
