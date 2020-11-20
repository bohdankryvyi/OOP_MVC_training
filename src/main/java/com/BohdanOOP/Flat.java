package com.BohdanOOP;

public class Flat extends Decor implements Comparable<Flat> {

    private int rooms;

    public Flat(String name, String size, DecorType decorType, int rooms) {
        super(name, size, decorType);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" + super.toString()+
                "rooms=" + rooms +
                '}';
    }

    @Override
    public int compareTo(Flat flat) {
        return Integer.compare(this.rooms, flat.rooms);
    }
}
