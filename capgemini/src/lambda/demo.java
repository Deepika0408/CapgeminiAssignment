package evaluation;
import java.util.*;

class Loan{
	public void applyLoan() {
		System.out.println("apply for loan");
	}
	
}
class HomeLoan extends Loan{
	public void applyLoan() {
		System.out.println("apply for home loan");
	}
	
}
public class demo {
	public static void main(String[] args) {
		Loan loan=new HomeLoan();
		loan.applyLoan();
		
	}

}
