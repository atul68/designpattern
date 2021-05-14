package com.design.patterns.creational.builder;

import java.time.LocalDate;

public class Director {

    public static void main(String args[]) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDto userDto = directBuilder(builder,user);
        System.out.println("userDto is :::"+userDto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    public static UserDto directBuilder(UserDTOBuilder userDTOBuilder, User user) {
        return  userDTOBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDay(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("atul");
        user.setLastName("pahuja");
        user.setBirthday(LocalDate.of(1988,12,19));
        Address address = new Address();
        address.setHouseNumber("S4");
        address.setStreet("sai jyoti home");
        address.setCity("bangalore");
        address.setState("KA");
        address.setZipCode("335513");
        user.setAddress(address);
        return user;
    }
}
