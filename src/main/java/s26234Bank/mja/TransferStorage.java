package s26234Bank.mja;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TransferStorage {
    private List<Transfer> transferList = new ArrayList<>();

    public List<Transfer> getTransferList() {
        return transferList;
    }

    public TransferStorage() {
        transferList.add(new Transfer(new User("X") new Money(20,20.0)));
        transferList.add(new Transfer(new User("Y") new Money(50,50.0)));
    }


}

