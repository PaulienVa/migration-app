package com.openvalue.studentregistration.registration.model;

import lombok.Value;

@Value
public class RegistrationResult {
    String studentName;
    String studentSurname;
    String university;
    RegistrationStatus status;
}
