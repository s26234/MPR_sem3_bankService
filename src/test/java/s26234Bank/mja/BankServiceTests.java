package s26234Bank.mja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BankServiceTests {

    private BankService bankService = new BankService(new ClientStorage(), new BankStorage());

    @Test
    void ifThereIsChangesInStatus() {
        Client client = new Client("Karolina", "Koralowa");
        double saldo = 500.00;
        String status = "ACCEPTED";
        int id = 2;

        bankService.registerUser(client, id, status, (int) saldo);
        String status1 = bankService.getBankerStatusOfId(id);
        bankService.setBankerStatusOfId(id, "DECLINED");
        String status2 = bankService.getBankerStatusOfId(id);
        assertThat(status1).isNotEqualTo(status2);
    }

        @Test
        void IfThereIsChangesInSaldoAfterValidCashout() {
            Client client = new Client("Adam", "Koralowy");
            double saldo = 800.00;
            String status = "ACCEPTED";
            int id = 3;

            bankService.registerUser(client,id,status,(int) saldo);
            double saldo1 = bankService.getBankerSaldoOfId(id);
            bankService.removeSaldoOfId(id,200);
            double saldo2 = bankService.getBankerSaldoOfId(id);
            assertThat(saldo1).isNotEqualTo(saldo2);
        }





    }









