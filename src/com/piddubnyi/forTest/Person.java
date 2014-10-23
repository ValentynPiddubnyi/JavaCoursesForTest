package com.piddubnyi.forTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fil on 10/9/14.
 */
public class Person {
    private final String firstName;
    private final String secondName;
    private final String email;
    private final int age;
    private final Position position;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.email = builder.email;
        this.age = builder.age;
        this.position = builder.position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!email.equals(person.email)) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (position != person.position) return false;
        if (!secondName.equals(person.secondName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + age;
        result = 31 * result + position.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", age=").append(age);
        sb.append(", position=").append(position);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String firstName;
        private String secondName;
        private String email;
        private int age;
        private Position position;

        public Builder(Person original){
            this.firstName = original.firstName;
            this.secondName = original.secondName;
            this.email = original.email;
            this.age = original.age;
            this.position = original.position;
        }

        public Builder(){

        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder position(Position position) {
            this.position = position;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
