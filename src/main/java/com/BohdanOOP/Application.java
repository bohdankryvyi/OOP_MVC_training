package com.BohdanOOP;

public class Application {
    public static void main(String[] args) {

        ChristmasTree myTree = new ChristmasTree("China bullshit", "Medium", DecorType.BALLS, "Green");
        ChristmasTree myTree1 = new ChristmasTree("Ukraine eggs", "Small", DecorType.BALLS, "Green");
        ChristmasTree myTree2 = new ChristmasTree("shit", "Small", DecorType.ADORNMENT, "Orange");
        ChristmasTree myTree3 = new ChristmasTree("Color lights", "Big", DecorType.LIGHTS, "All");
        ChristmasTree myTree4 = new ChristmasTree("Candles", "Small", DecorType.CANDLES, "White");

        Flat flat = new Flat("Funny balls", "Medium", DecorType.BALLS, 4 );
        Flat flat1 = new Flat("Cozy candles", "Big", DecorType.CANDLES, 2 );
        Flat flat2 = new Flat("Funny balls", "Medium", DecorType.ADORNMENT, 1 );

        Street street = new Street("Street Adornment", "Big", DecorType.ADORNMENT, 4.05);
        Street street1 = new Street("Street white lights", "Big", DecorType.LIGHTS, 3.12);
        Street street2 = new Street("Street Balls", "Medium", DecorType.BALLS, 0.65);





    }

}
