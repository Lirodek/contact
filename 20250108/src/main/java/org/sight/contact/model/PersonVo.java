package org.sight.contact.model;

public class PersonVo {
    private String name;
    private int number;
    private String group;

    public PersonVo() {    }

    public PersonVo(String name, int number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " | " + number + " | " + group;
    }
}
