package s26234Bank.mja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankServiceTests {
    private final BankStorage bankStorage = new BankStorage();
    private final TransferStorage transferStorage = new TransferStorage();
    private final BankService bankService = new BankService(bankStorage,transferStorage);

    @Test
    void shouldNotFindMoney() {
        User user = new ("Z");
        Integer id = 20;

        TransferInfo transferInfo = bankService.transferCash(user,id);

        Assertions.assertNull(transferInfo,"Ups");
    }



}
