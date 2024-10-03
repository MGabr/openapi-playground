package com.github.mgabr.openapi_playground;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Dog extends Pet {

    public Dog(Integer id, String name, Integer age) {
        super(PetType.DOG, id, name);
        this.age = age;
    }

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private final Integer age;
}
