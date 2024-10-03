package com.github.mgabr.openapi_playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.client.MockMvcWebTestClient;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class PetControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private WebTestClient webTestClient;

    @BeforeEach
    void setUp() {
        webTestClient = MockMvcWebTestClient
            .bindToApplicationContext(this.wac).build();
    }

    @Test
    void testGetPet() {
        webTestClient
            .get()
            .uri("/pets/1")
            .exchange()
            .expectStatus()
            .isOk()
            .expectBody(Pet.class)
            .isEqualTo(new Dog(1, "Rocky", 7));
    }
}
