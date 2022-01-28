package com.openvalue.studentregistration;

import java.time.Instant;
import java.util.Date;

public class TestData {
    public static final String BOB = "Bob";
    public static final String DOE = "Doe";
    public static final Date DATE_OF_BIRTH = Date.from(Instant.now());
    public static final Date APPLICATION_YEAR = Date.from(Instant.parse("2012-12-03T00:00:30.00Z"));
    public static final String UNIVERSITY_APPLICATION = "Yale";
    public static final String CITY_APPLICATION = "New York";
}
