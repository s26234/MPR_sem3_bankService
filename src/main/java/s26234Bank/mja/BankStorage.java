package s26234Bank.mja;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankStorage {
    private Money ten = new Money(10,10.0);
    private Money twenty = new Money(20,20.0);
    private Money fifty = new Money(50,50.0);
    private List<Money> cashList = new ArrayList<>();

    public List<Money> getCashList() {
        return cashList;
    }

    public BankStorage() {
        cashList.add(ten);
        cashList.add(twenty);
        cashList.add(fifty);
    }

    public findId (Integer id ) {
        for (Money cash : cashList) {
            if (cash.getId().equals(id)) {
                return cash.getId();
            }
        }
        return null;
    }

    public Money findMoney (Integer id) {
        for (Money cash : cashList) {
            if (cash.getId().equals(id)) {
                return cashList.get(cashList.indexOf(cash));
            }
        }
        return null;
    }
}
