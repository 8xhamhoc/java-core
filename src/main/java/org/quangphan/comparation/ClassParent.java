package org.quangphan.comparation;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ClassParent {

    private String name;
    private Integer age;
    private Set<ClassChild> classChildren = new HashSet<>();

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Set<ClassChild> getClassChildren() {
        return classChildren;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setClassChildren(Set<ClassChild> classChildren) {
        this.classChildren = classChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassParent that = (ClassParent) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(classChildren, that.classChildren);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classChildren);
    }
}
