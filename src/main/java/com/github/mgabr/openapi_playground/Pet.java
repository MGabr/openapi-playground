package com.github.mgabr.openapi_playground;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Dog.class, name = "DOG"),
    @JsonSubTypes.Type(value = Cat.class, name = "CAT")
})
@Data
public abstract class Pet {

    private final PetType type;
    private final Integer id;
    private final String name;
}
