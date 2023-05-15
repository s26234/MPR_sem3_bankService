package s26234Bank.mja;

import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class BankService {
    private ClientStorage clientStorage;
    private BankStorage bankStorage;

    public BankService(ClientStorage clientStorage, BankStorage bankStorage) {
        this.clientStorage = clientStorage;
        this.bankStorage = bankStorage;
    }

    public Banker registerUser (Client client, int id, String status, int saldo) {
        //dodanie Client a do storage
        clientStorage.addClient(client);
        //dodanie wszystkiego do bankstorageu
        bankStorage.addBanker(new Banker(client, id,status, saldo));
        //zwrot registera
        return bankStorage.getBankerById(id);
    }

    public Banker removeSaldoOfId(int id, double removeSaldo){
        return bankStorage.removeSaldoOfId(id, removeSaldo);
    }

    public Banker addToSaldoOfId(int id, double addSaldo){
        return bankStorage.addToSaldoOfId(id, addSaldo);
    }

    public Banker getBankerOfId(int id){
        return bankStorage.getBankerOfId(id);
    }

    public List<Client> getAllClients(){
        return clientStorage.getClientList();
    }

    public List<Banker> getAllBankers(){
        return bankStorage.getBankerList();
    }

    public String getBankerStatusOfId(int id){
        return bankStorage.getBankerStatusOfId(id);
    }

    public String setBankerStatusOfId(int id, String status){
        return bankStorage.setBankerStatusOfId(id, status);
    }

    public double getBankerSaldoOfId(int id){
        return bankStorage.getBankerSaldoOfId(id);
    }

}
