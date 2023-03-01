package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc{
	final private float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit =creditLimit ;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	public void  withdraw(float accBal) {
		System.out.println("Acc no"+this.getAccNo()+""+"Acc name:"+this.getAccNm()+""+"Account balance:"+(accBal+creditLimit));
	}
	

}
