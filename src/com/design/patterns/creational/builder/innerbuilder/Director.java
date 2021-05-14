package com.design.patterns.creational.builder.innerbuilder;

import java.time.LocalDate;
import com.design.patterns.creational.builder.innerbuilder.UserWebDto.UserWebDTOBuilder;
public class Director {

    public static void main(String args[]) {
        User user = createUser();
        UserDto userDto = directBuilder(UserWebDto.getBuilder(),user);
        System.out.println("userDto is :::"+userDto);
    }

    public static UserDto directBuilder(UserWebDTOBuilder userDTOBuilder, User user) {
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
