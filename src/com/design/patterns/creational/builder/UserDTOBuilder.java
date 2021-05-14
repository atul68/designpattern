package com.design.patterns.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // method to build part of product at a time
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthDay(LocalDate birthDay);

    UserDTOBuilder withAddress(Address address);

    // method to "assemble" final product
    UserDto build();

    //(optinal method) to fetch already build object
    UserDto getUserDto();
}
