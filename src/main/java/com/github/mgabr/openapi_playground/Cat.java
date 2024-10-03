package com.github.mgabr.openapi_playground;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Cat extends Pet {

    public Cat(Integer id, String name, Integer lives) {
        super(PetType.CAT, id, name);
        this.lives = lives;
    }

    private final Integer lives;
}
