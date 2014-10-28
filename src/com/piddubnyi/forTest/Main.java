package com.piddubnyi.forTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fil on 10/9/14.
 */
public class Main {
 /*   public static void main(String args[]){

        int[] arrayFirst = {1,5,4,23,65,32,78};
        int[] arraySecond = {3,5,24,4,1,2,34,45,32,5};

        ArraysUnion arrayUnion = new ArraysUnion();
        int[] innerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        int[] outerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);

        System.out.println("First array: \t" + Arrays.toString(arrayFirst) + "\nSecond array: \t" + Arrays.toString(arraySecond));
        System.out.println("Inner union: \t" + Arrays.toString(innerUnionArray));
        System.out.println("Outer union: \t" + Arrays.toString(outerUnionArray));
    }
*/
    public static void main(String args[]){
        Person person = new Person.Builder()
                .firstName("FirstName")
                .secondName("SecondName")
                .age(30)
                .email("fsfdsdf@gmail.com")
                .position(Position.PM)
                .build();
        System.out.println(person.toString());

        List<Person> arrayFirst = new ArrayList<Person>();
           arrayFirst.add(
                   new Person.Builder()
                            .firstName("FirstName1")
                            .secondName("SecondName1")
                           .email("email1@gmail.com")
                           .age(30)
                           .position(Position.PM)
                           .build());
        arrayFirst.add(new Person.Builder().firstName("FirstName2").secondName("SecondName2").email("email2@gmail.com").age(30).position(Position.PM).build());
        arrayFirst.add(new Person.Builder().firstName("FirstName3").secondName("SecondName3").email("email3@gmail.com").age(30).position(Position.PM).build());
        arrayFirst.add(new Person.Builder().firstName("FirstName4").secondName("SecondName4").email("email4@gmail.com").age(30).position(Position.PM).build());


        List<Person>  arraySecond = new ArrayList<Person>();
        arraySecond.add(new Person.Builder().firstName("FirstName1").secondName("SecondName1").email("email1@gmail.com").age(30).position(Position.PM).build());
        arraySecond.add(new Person.Builder().firstName("FirstName2").secondName("SecondName2").email("email2@gmail.com").age(30).position(Position.PM).build());
        arraySecond.add(new Person.Builder().firstName("FirstName6").secondName("SecondName6").email("email6@gmail.com").age(30).position(Position.PM).build());
        arraySecond.add(new Person.Builder().firstName("FirstName8").secondName("SecondName8").email("email8@gmail.com").age(30).position(Position.PM).build());


        new ServiceDelegateListUnion(new ListUnion()).innerUnion(arrayFirst, arraySecond).toString();
        }
    }