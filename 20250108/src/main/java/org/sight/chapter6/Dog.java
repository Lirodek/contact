package org.sight.chapter6;

public class Dog extends Animal{

    private int age;
    public Dog() {}

    public void weeping(){
        super.setName("popi");

        System.out.println(super.getName() + "'s  bowbow");
    }
}
