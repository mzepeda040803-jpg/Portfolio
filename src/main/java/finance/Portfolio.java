package finance;

import java.util.ArrayList;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue(){
        //loop through the Valuables in ArrayList assets
        //keep a total
        double total = 0;
        for (Valuable valuable: assets) {
            //add everything up
            total += valuable.getValue();
        }
        //return the total
        return 0;
    }

}
