package polymorphism;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccountTest {

	public static void main(String[] args) {
		Account[] accounts=new Account[3];
		
		accounts[0]=new CheckingAccount("Amanuel","Columbus","Chase",1234);
		accounts[1]=new SavingAccount("saving account",34445,"DC","Chase");
		accounts[2]=new SavingAccount("saving account",50188,"New York","Wells Fargo");
				
		for(Account ac:accounts){
			System.out.println(ac.getClass().getName()+" "+ac);
			
			
			Class<?> className=Account.class;
			System.out.println(	className.getClass().getSimpleName());
			
			
			Map<String ,List<String>> mpStates=new HashMap<>();
			mpStates.put("Amhara", Arrays.asList("Addis Ababa","Bahirdar","Dessie"));
			mpStates.put("Tigray", Arrays.asList("Mekelle","Adwa","Axum","Shire"));
			mpStates.put("Oromo", Arrays.asList("Debrezeit","Nazreth","Adama"));
			mpStates.put("Somaliya", Arrays.asList("Jigjiga","Harare","Diredawa"));
			
			Set<String> stateKeys=mpStates.keySet();
			System.out.println("Key Lists..... "+stateKeys);
			
			
			
			
			
			for(String key:stateKeys)
			{
				System.out.println("["+key+"]==>"+ mpStates.get(key));
			}
			
			
			
			
			
			
			
		}

	}

}
