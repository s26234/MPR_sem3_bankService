package s26234Bank.mja;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BankServicesMockTests {
    @Mock
    private BankStorage bankStorage;

    @Mock
    private ClientStorage clientStorage;

    @InjectMocks
    private BankService bankService;


    @Test
    void ifThereIsClientMock() {
        Client client = new Client("Jan", "Pośpieszny");
        when(clientStorage.getClientList()).thenReturn(List.of(client));
        assertThat(bankService.getAllClients()).isNotNull();
    }

    @Test
    void IfThereIsBankerMock(){
        Client client = new Client("Dorota", "Kowalska");
        Banker banker = new Banker(client,2,"ACCEPTED", 1200);
        when(bankStorage.getBankerList()).thenReturn(List.of(banker));
        assertThat(bankService.getAllBankers()).isNotNull();
    }



}
