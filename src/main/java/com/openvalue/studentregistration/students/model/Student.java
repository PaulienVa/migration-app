package com.openvalue.studentregistration.students.model;

import lombok.Value;

import java.util.Date;

@Value
public class Student {
    String name;
    String surName;
    Date dateOfBirth;
}
