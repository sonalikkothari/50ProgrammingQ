package String;

public class AccountEmp {
		
	int empAccountId;
	String name;
	double balance;
	
	@Override
	public  int hashCode() {
		return empAccountId;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean isEqual = false;
		if(o  instanceof AccountEmp) {
			AccountEmp ac = (AccountEmp) o;
			if((ac.empAccountId == this.empAccountId) && (ac.name == this.name) && (ac.balance == this.balance))
				{isEqual = true;
				return isEqual;
		}
		}
		
		return isEqual;
	}
}
