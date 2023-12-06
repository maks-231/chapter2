package com.thoughtmechanix.licenses.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Person {
    private long id;
    private String name;
    private String lastName;
}
