package com.piddubnyi.forTest;

/**
 * Created by fil on 10/9/14.
 */
public class Person {
    private final String firstName;
    private final String secondName;
    private final String email;
    private final int age;
    private final Position position;

    public Person(String firstName,String secondName, String email, int age, Position position){
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.age = age;
        this.position = position;
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
}
