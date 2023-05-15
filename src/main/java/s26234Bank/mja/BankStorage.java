package s26234Bank.mja;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankStorage {
    private List<Banker> bankerList = new ArrayList<>();

    public List<Banker> getBankerList() {
        return bankerList;
    }

    public void addBanker(Banker banker) {
        bankerList.add(banker);
    }

    public Banker getBankerById(int id) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                return banker;
            } else {
                System.out.println("Nie ma takiego klienta");
            }
        }
        return null;
    }

    public Banker removeSaldoOfId(int id, double removeSaldo) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                if (banker.getSaldo() - removeSaldo < 0) {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy na koncie");
                    banker.setStatus("DECLINED");
                    return banker;
                } else {
                    System.out.println("Poprzednei saldo wynosiło " + banker.getSaldo() + "; Po przelewie wynosi: " + (banker.getSaldo() - removeSaldo));
                    return banker;
                }
            }
        }
        System.out.println("Nie ma takiego klienta");
        return null;
    }

    public Banker addToSaldoOfId(int id, double addSaldo) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                System.out.println("Poprzednie saldo klienta wynosiło " + banker.getSaldo() + "; Po wpłacie wynosi: " + (banker.getSaldo() + addSaldo));
                banker.setStatus("ACCEPTED");
                banker.setSaldo(banker.getSaldo() + addSaldo);
                return banker;
            }
        }
        System.out.println("Nie ma takiego klienta");
        return null;
    }

    public Banker getBankerOfId(int id) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                banker.setStatus("ACCEPTED");
                return banker;
            }
        }
        System.out.println("Nie ma takiego klienta o takim id!");
        return null;
    }

    public String getBankerStatusOfId(int id) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                return banker.getStatus();
            }
        }
        System.out.println("Nie ma takiego klienta o takim id!");
        return null;
    }

    public String setBankerStatusOfId(int id, String status) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                return banker.setStatus(status);
            }
        }
        System.out.println("Nie ma takiego klienta o takim id!");
        return null;
    }

    public Double getBankerSaldoOfId(int id) {
        for (Banker banker : bankerList) {
            if (banker.getId() == id) {
                return banker.getSaldo();
            }
        }
        System.out.println("Nie ma takiego klienta o takim id!");
        return null;
    }
}
