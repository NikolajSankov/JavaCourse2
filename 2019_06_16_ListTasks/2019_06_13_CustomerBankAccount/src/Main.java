import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Sasha", "Petrov");
		Customer c2 = new Customer("Ivan", "Ivanov");
		
		BankAccount b1 = new BankAccount("DE932", c1);
		BankAccount b2 = new BankAccount("RU483", c2);
		BankAccount b3 = new BankAccount("PK234", c1);
		BankAccount b4 = new BankAccount("DF623", c2);
		BankAccount [] bk = {b1, b2, b3, b4};
		
		List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(bk));
		
		Map<String, List<BankAccount>> map = new HashMap<>();
		
		for(BankAccount account:bankAccounts) {
			String key = account.getCustomer().getFname()+" "+account.getCustomer().getLname();
			if(map.containsKey(key)) {
				List<BankAccount> bankaccounts = map.get(key);
				bankaccounts.add(account);
			} else {
				
			}
		}
		
		
		
	}
}
