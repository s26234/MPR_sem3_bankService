package s26234Bank.mja;

public class Transfer {
    private User user;
    private Money cash;

    public Transfer (User user, Money cash) {
        this.user =  user;
        this.cash = cash;
    }

    public User getUser() {
        return user;
    }

    public Money getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "user=" + user +
                ", cash=" + cash +
                '}';
    }
}
