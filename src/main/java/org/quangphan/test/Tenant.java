package org.quangphan.test;

public class Tenant {

    private String name;
    private String transitKey;

    public Tenant() {
    }

    public Tenant(String name, String transitKey) {
        this.name = name;
        this.transitKey = transitKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransitKey() {
        return transitKey;
    }

    public void setTransitKey(String transitKey) {
        this.transitKey = transitKey;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "name='" + name + '\'' +
                ", transitKey='" + transitKey + '\'' +
                '}';
    }
}
