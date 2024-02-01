package org.quangphan.design.patterns.builder.cls;

public class UserSetterBuilder {

    private User user = new User();

    public UserSetterBuilder(String name) {
        this.user.setName(name);
    }

    public UserSetterBuilder age(Integer age) {
        this.user.setAge(age);
        return this;
    }

    public UserSetterBuilder address(String address) {
        this.user.setAddress(address);
        return this;
    }

    public UserSetterBuilder job(String job) {
        this.user.setJob(job);
        return this;
    }

    public User build() {
        return this.user;
    }

}
