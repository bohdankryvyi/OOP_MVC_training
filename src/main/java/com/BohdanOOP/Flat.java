package com.BohdanOOP;

public class Flat extends Decor {
    private int rooms;


    public Flat(String name, String size, DecorType decorType, int rooms) {
        super(name, size, decorType);
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" + super.toString()+
                "rooms=" + rooms +
                '}';
    }
}
