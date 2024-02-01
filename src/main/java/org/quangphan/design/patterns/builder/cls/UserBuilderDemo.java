package org.quangphan.design.patterns.builder.cls;

public class UserBuilderDemo {

    public static void main(String[] args) {

        User user = new UserSetterBuilder("Quang Phan")
                .age(33)
                .address("Danang")
                .job("Sofware engineer")
                .build();

        System.out.println(user.toString());

        User2 user2 = new User2Builder()
                .name("ABC")
                .age(20)
                .address("Danang")
                .job("IT")
                .build();

        System.out.println(user2.toString());

    }
}
