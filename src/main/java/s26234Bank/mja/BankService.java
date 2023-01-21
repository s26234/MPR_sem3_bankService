package s26234Bank.mja;

import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class BankService {
    private final BankStorage bankStorage;
    private final TransferStorage transferStorage;

    public BankService (BankStorage bankStorage, TransferStorage transferStorage) {
        this.bankStorage = bankStorage;
        this.transferStorage = transferStorage;
    }

    public List<Transfer> getAllTransfers() {
        return bankStorage.getCashList();
    }

    public TransferInfo transferCash(User user, Integer id) {
        Money cash = bankStorage.findMoney(id);
        List<Transfer> transferList = transferStorage.getTransferList();
    }

    if(cash==null) {
        System.out.println("Brak mozliwosci wyplacenia");
        return null;
    }

//    boolean noUser = false;
//    for  noUser
//


}
