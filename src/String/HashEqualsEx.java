package String;

import java.util.HashSet;
import java.util.Set;

import String.AccountEmp;
public class HashEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountEmp acc1 = new AccountEmp();
			acc1.empAccountId = 20;
			acc1.name = "Sonali";
			acc1.balance= 5555.0;
		AccountEmp acc2 = new AccountEmp();
			acc2.empAccountId = 20;
			acc2.name = "Sonali";
			acc2.balance= 5555.0;
			
		if(acc1.equals(acc2)) 
			System.out.println("They are equal");
		else
			System.out.println("Not Equal");
		
		Set<AccountEmp> hshSet = new HashSet<AccountEmp> ();
		hshSet.add(acc1);
		hshSet.add(acc2);
		
		System.out.println("HashCode::" +acc1.hashCode());
		System.out.println("HashCode::" +acc2.hashCode());
		System.out.println("Size of Hashset::" +hshSet.size());
		
	}

}
