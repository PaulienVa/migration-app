package com.openvalue.studentregistration.registration.model;

import lombok.Value;
import java.util.Date;

@Value
public class RegistrationRequest {
    String studentName;
    String studentSurname;
    Date studentBirthDate;
    Date yearForApplication;
    String universityForApplication;
    String cityOfApplication;
}
