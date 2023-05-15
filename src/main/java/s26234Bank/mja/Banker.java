package s26234Bank.mja;

public class Banker {
    private Client client;
    private double saldo;
    private String status;
    private int id;

    public Banker(Client client, int id, String status, double saldo ) {
        this.client = client;
        this.saldo = saldo;
        this.status = status;
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        this.status = status;
        return status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Banker{" +
                "client=" + client +
                ", saldo=" + saldo +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}

