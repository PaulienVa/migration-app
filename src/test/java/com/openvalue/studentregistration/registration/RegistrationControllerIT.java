package com.openvalue.studentregistration.registration;

import com.openvalue.studentregistration.registration.model.RegistrationRequest;
import com.openvalue.studentregistration.registration.model.RegistrationResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;

import static com.openvalue.studentregistration.TestData.*;
import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ContextConfiguration(initializers = { RegistrationControllerIT.Initializer.class})
public class RegistrationControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void register_successfully() {
        final RegistrationRequest registrationRequest = new RegistrationRequest(
                BOB, DOE, DATE_OF_BIRTH, APPLICATION_YEAR, UNIVERSITY_APPLICATION, CITY_APPLICATION
        );

       final ResponseEntity<RegistrationResult> result = testRestTemplate.postForEntity(
               RegistrationController.PATH, registrationRequest, RegistrationResult.class
       );

        assertEquals(200, result.getStatusCodeValue());
    }

    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:11-alpine")
            .withDatabaseName("student_registration")
            .withUsername("postgres")
            .withPassword("postgres");

    static class Initializer
            implements ApplicationContextInitializer<ConfigurableApplicationContext> {
        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            postgreSQLContainer.start();
            TestPropertyValues.of(
                    "spring.datasource.url=" + postgreSQLContainer.getJdbcUrl(),
                    "spring.datasource.username=" + postgreSQLContainer.getUsername(),
                    "spring.datasource.password=" + postgreSQLContainer.getPassword(),
                    "spring.jpa.hibernate.ddl-auto=create-drop"
            ).applyTo(configurableApplicationContext.getEnvironment());
        }
    }
}
