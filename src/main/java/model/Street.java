package com.BohdanOOP;

public class Street extends Decor {
    private double length;

    public Street(String name, String size, DecorType decorType, double length) {
        super(name, size, decorType);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Street{" + super.toString()+
                "length=" + length +
                '}';
    }
}
