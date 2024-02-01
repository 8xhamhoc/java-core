package org.quangphan.design.patterns.builder.cls;

public class User2 {

    private String name;
    private Integer age;
    private String address;
    private String job;

    public User2(String name, Integer age, String address, String job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }



    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
