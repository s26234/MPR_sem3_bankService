package s26234Bank.mja;

public class Money {
    private Integer id;
    private double cash;

    public Money(Integer id, double cash) {
        this.id = id;
        this.cash = cash;

    }


    public int getId() {
        return id;
    }

    public double getCash() {
        return cash;
    }

}