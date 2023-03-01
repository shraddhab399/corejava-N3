package org.tnsif.customer;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Customer {
	public static void main(String[] args) {
		BankFactory f=new MMBankFactory();//lazy binding
		MMSavingAcc p=new MMSavingAcc(1234,"shraddha bhor",10000f,true);
		MMCurrentAcc n=new MMCurrentAcc(1235,"mrunali patil",1000f,6f);
		//saving account
		System.out.println(" Saving account");
		System.out.println(p);
		p.withdraw(p.getAccBal());
		
		//Current account
		System.out.println("Current Account");
		System.out.println(n);
		n.withdraw(n.getAccBal());
	}

}



