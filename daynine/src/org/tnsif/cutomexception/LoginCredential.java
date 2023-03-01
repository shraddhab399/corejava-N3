package org.tnsif.cutomexception;
//to create custom exception
public class LoginCredential  extends Exception{
	//data members
	 private String str;
	//parameterized constructor.
	public LoginCredential(String str) {
		super();
		this.str = str;
	}
	//to string method
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
	
	

}
