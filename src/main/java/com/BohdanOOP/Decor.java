package com.BohdanOOP;

public class Decor {
    private String name;
    private String size;
    DecorType decorType;

    public Decor(String name, String size, DecorType decorType) {
        this.name = name;
        this.size = size;
        this.decorType = decorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DecorType getDecorType() {
        return decorType;
    }

    public void setDecorType(DecorType decorType) {
        this.decorType = decorType;
    }

    @Override
    public String toString() {
        return "Decor{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", decorType=" + decorType +
                '}';
    }
}
