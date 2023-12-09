package com.thoughtmechanix.licenses.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
/**
 * Person class
 */
public class Person {
    private long id;
    private String name;
    private String lastName;
}
