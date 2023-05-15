package s26234Bank.mja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S26234BankApplication {

	private final BankService bankService;

	public S26234BankApplication(BankService bankService) {
		this.bankService = bankService;

		//rejestracja klienta o danym id i saldzie
		System.out.println("\n" + (bankService.registerUser(new Client("Michal", "Jach"),1, "ACCEPTED", 1500)) +"\n");

		//Przelew danego klienta o danym id z poprawna iloscia pieniedzy
		System.out.println((bankService.removeSaldoOfId(1,233.11))+"\n");

		//Odczytanie klienta o danym id
		System.out.println((bankService.getBankerOfId(1))+"\n");

		//Przelew danego klienta o danym id jezeli nie mamy wystarczajaco pieniedzy na koncie
		System.out.println((bankService.removeSaldoOfId(1, 2290.99))+"\n");

	}

	public static void main(String[] args) {
		SpringApplication.run(S26234BankApplication.class, args);


	}

}
