package org.quangphan.generics;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Tung", 20));
        users.add(new User("Nam", 20));
        users.add(new User("An", 20));
        users.add(new User("Viet", 20));

        List<User> userList = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());

        userList.forEach(user -> System.out.println("name: " + user.getName() + " - age: " + user.getAge()));


        Instant now = Instant.now();

        System.out.println("epoch second: " + now.getEpochSecond());


    }

}
