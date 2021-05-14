package com.design.patterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserDTOBuilder
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;

    private String lastName;

    private String age;

    private String address;

    private UserWebDto userWebDto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        Period ageYear = Period.between(birthDay,LocalDate.now());
        this.age = Integer.toString(ageYear.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ","+ address.getState()
                +"\n"+ address.getCity() +","+ address.getState()
                +"\n"+ address.getZipCode();
        return this;
    }

    @Override
    public UserDto build() {
        userWebDto = new UserWebDto(this.firstName +" "+ this.lastName,address,age);
        return userWebDto;
    }

    @Override
    public UserDto getUserDto() {
        return userWebDto;
    }
}
