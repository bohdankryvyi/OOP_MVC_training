package com.BohdanOOP;

public class ChristmasTree extends Decor {
    private String colour;

    public ChristmasTree(String name, String size, DecorType decorType, String colour) {
        super(name, size, decorType);
        this.colour = colour;

    }

    @Override
    public String toString() {
        return "ChristmasTree{" + super.toString()+
                "colour='" + colour + '\'' +
                '}';
    }
}
