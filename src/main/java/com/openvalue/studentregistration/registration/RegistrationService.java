package com.openvalue.studentregistration.registration;

import com.openvalue.studentregistration.students.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private RegistrationRepository registrationRepository;
    private StudentRepository studentRepository;

    public RegistrationService(
            RegistrationRepository registrationRepository,
            StudentRepository studentRepository
    ) {
    }
}
