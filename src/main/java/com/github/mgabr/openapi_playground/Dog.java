package com.github.mgabr.openapi_playground;

import lombok.*;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Dog extends Pet {

    public Dog(Integer id, String name, Integer age) {
        super(PetType.DOG, id, name);
        this.age = age;
    }

    private final Integer age;
}
