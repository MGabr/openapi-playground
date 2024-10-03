package com.github.mgabr.openapi_playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @GetMapping("/pets/{id}")
    public Pet getPet(@PathVariable Integer id) {
        return new Dog(id, "Rocky", 7);
    }
}
