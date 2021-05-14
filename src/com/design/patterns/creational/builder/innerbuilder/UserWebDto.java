package com.design.patterns.creational.builder.innerbuilder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDto implements UserDto {

    private String name;

    private String address;

    private String age;


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static UserWebDTOBuilder getBuilder() {
        return  new UserWebDTOBuilder();
    }

    @Override
    public String toString() {
        return "UserWebDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class UserWebDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserWebDto userWebDto;

        public UserWebDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserWebDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserWebDTOBuilder withBirthDay(LocalDate birthDay) {
            Period ageYear = Period.between(birthDay,LocalDate.now());
            this.age = Integer.toString(ageYear.getYears());
            return this;
        }

        public UserWebDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ","+ address.getState()
                    +"\n"+ address.getCity() +","+ address.getState()
                    +"\n"+ address.getZipCode();
            return this;
        }

        public UserDto build() {
            userWebDto = new UserWebDto();
            userWebDto.setAddress(address);
            userWebDto.setAge(age);
            userWebDto.setName(this.firstName + " "+this.lastName);
            return userWebDto;
        }

        public UserDto getUserDto() {
            return userWebDto;
        }
    }
}
