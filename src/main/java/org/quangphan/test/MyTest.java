package org.quangphan.test;

public class MyTest {

    public static void main(String[] args) {

//        show(1, "11");

        String hex = "00000184C2E2AFF1";

        System.out.println(hex.toLowerCase());
    }

    public static void show(Integer number, String... values) {
        System.out.println("Number: " + number);

        for (String value : values) {
            System.out.println("value: " + value);
        }
    }

}
