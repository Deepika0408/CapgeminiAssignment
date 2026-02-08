package capgemini;
import java.util.*;


abstract class Loan {

    abstract void applyLoan();
    abstract void checkEligibility(int creditScore);
    abstract void calculateEMI(double amount);
    abstract void approveLoan();
}

class HomeLoan extends Loan {

    double interest = 8.5;
    boolean eligible = false;

    @Override
    public void applyLoan() {
        System.out.println("Applying for Home Loan");
    }

    @Override
    public void checkEligibility(int creditScore) {
        if (creditScore >= 750) {
            eligible = true;
            System.out.println("Eligibility check passed");
        } else {
            System.out.println("Eligibility check failed");
        }
    }

    @Override
    public void calculateEMI(double amount) {
        if (eligible) {
            double emi = (amount * interest) / 100;
            System.out.println("EMI calculated: ₹" + emi);
        }
    }

    @Override
    public void approveLoan() {
        if (eligible) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan rejected");
        }
    }
}

public class LoanSystem {

	public static void main(String[] args) {
		Loan loan = new HomeLoan(); 

        loan.applyLoan();
        loan.checkEligibility(780);
        loan.calculateEMI(2000000);
        loan.approveLoan();
    }

	}


