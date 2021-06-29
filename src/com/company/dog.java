package com.company;

public class dog extends Animal {
    public String breed;
    public String snoutLength;
    public final String chipId;

    public dog(
            int legs,
            String size,
            boolean isFixed,
            String name,
            double weight,
            String snoutLength,
            String chipId
    ) {
        super(legs, size, isFixed, name, weight);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.chipId = chipId;
    }

    @Override
    public void speak() {
        System.out.println("A-Woof");
    }
}
