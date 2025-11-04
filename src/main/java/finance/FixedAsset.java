package finance;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public String getName() {
        return name;
    }

    public abstract double getValue();

}
