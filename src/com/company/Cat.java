package com.company;

public class Cat extends Animal {
    public String pattern;
    public boolean wasStray;
    public int killCount;


    public Cat(
            int legs,
            String size,
            boolean isFixed,
            String name,
            double weight,
            boolean wasStray,
            int killCount
    ) {
        super(legs, size, isFixed, name, weight);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.killCount = killCount;
    }
    public void speak() {
        if (killCount > 5) {
            System.out.println("hiss") {
            } else {
                System.out.println("Mee");
            }

        }
    }
}
