public abstract class Site {

    protected double _units;
    protected double _rate;

    protected final static double TAX_RATE = 0.13;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public abstract double getBillableAmount();
}
