package model;

public class ChristmasTree extends Decor implements Comparable<ChristmasTree> {
    private String colour;

    public ChristmasTree(String name, String size, DecorType decorType, String colour) {
        super(name, size, decorType);
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" + super.toString() +
                "colour='" + colour + '\'' +
                '}';
    }


    public int compareTo(ChristmasTree o) {
        return colour.compareTo(o.getColour());
    }


}
