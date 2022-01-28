package com.openvalue.studentregistration.registration;

import com.openvalue.studentregistration.registration.model.RegistrationRequest;
import com.openvalue.studentregistration.registration.model.RegistrationResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    final static String PATH = "/registrations";

    @RequestMapping(method = RequestMethod.POST, path = PATH)
    public ResponseEntity<RegistrationResult> register(@RequestBody RegistrationRequest request) {

    }
}
