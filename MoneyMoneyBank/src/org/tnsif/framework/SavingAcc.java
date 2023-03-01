package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0.0f;

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void  withdraw(float accBal) {
		System.out.println("Acc no"+this.getAccNo()+""+"Acc name:"+this.getAccNm()+""+"Account balance:"+this.getAccBal());
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	

}