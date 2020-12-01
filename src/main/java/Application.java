import model.ChristmasTree;
import model.DecorType;
import model.Flat;
import model.Street;
import view.MyView;

import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        //Theoretically we should set business logic and data into MODEL package.
        //However in this app we manually creating objects in the main

        ChristmasTree myTree = new ChristmasTree("China bullshit", "Medium", DecorType.BALLS, "Green");
        ChristmasTree myTree1 = new ChristmasTree("Ukraine eggs", "Small", DecorType.BALLS, "Green");
        ChristmasTree myTree2 = new ChristmasTree("shit", "Small", DecorType.ADORNMENT, "Orange");
        ChristmasTree myTree3 = new ChristmasTree("Color lights", "Big", DecorType.LIGHTS, "All");
        ChristmasTree myTree4 = new ChristmasTree("Candles", "Small", DecorType.CANDLES, "White");

        TreeSet<ChristmasTree> tree = new TreeSet<ChristmasTree>();
        tree.add(myTree);
        tree.add(myTree1);
        tree.add(myTree2);
        tree.add(myTree3);
        tree.add(myTree4);

        System.out.println(tree);


        Flat flat = new Flat("Funny balls", "Medium", DecorType.BALLS, 4 );
        Flat flat1 = new Flat("Cozy candles", "Big", DecorType.CANDLES, 2 );
        Flat flat2 = new Flat("Funny balls", "Medium", DecorType.ADORNMENT, 1 );

        TreeSet<Flat> flatt = new TreeSet<Flat>();
        flatt.add(flat);
        flatt.add(flat1);
        flatt.add(flat2);

        Street street = new Street("Street Adornment", "Big", DecorType.ADORNMENT, 4.05);
        Street street1 = new Street("Street white lights", "Big", DecorType.LIGHTS, 3.12);
        Street street2 = new Street("Street Balls", "Medium", DecorType.BALLS, 0.65);


new MyView().show();


    }

}
