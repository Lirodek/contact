package org.sight.chapter6;

public abstract class Animal {
    private String name;

    public abstract void weeping();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
