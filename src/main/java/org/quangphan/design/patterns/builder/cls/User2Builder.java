package org.quangphan.design.patterns.builder.cls;

public class User2Builder {

    private String name;
    private Integer age;
    private String address;
    private String job;

    public User2Builder name(String name) {
        this.name = name;
        return this;
    }

    public User2Builder age(Integer age) {
        this.age = age;
        return this;
    }

    public User2Builder address(String address) {
        this.address = address;
        return this;
    }

    public User2Builder job(String job) {
        this.job = job;
        return this;
    }

    public User2 build() {
        return new User2(name, age, address, job);
    }

}
