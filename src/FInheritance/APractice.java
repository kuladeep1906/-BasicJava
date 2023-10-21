package FInheritance;


class Account{
	private int accNo;
	private String name;
	private String address;
	private long phno;
	private String dob;
	protected long balance=0;
	
	public int getAccNo() {return accNo;}	
	public String getName() {return name;}
	public String getAddress() {return address;}
	public String getdob() {return dob;}
	public long getBalance() {return balance;}
	public long getPhno() {return phno;}	
	
	public void setAddress(String address) {
		this.address = address;}
	public void setPhno(long phno) {
		this.phno = phno;}
	

public Account(int accNo,String name,String dob,long balance) {
	this.accNo=accNo;
	this.name=name;
	this.dob=dob;
	this.balance=balance;}
public Account() {   //we have to declare it because subclass constructor implicitly calls super class' constructor, if we didn't declare it will give error and we have to call via super method in subclass.	
}                   //  for detailed explanation -> https://youtu.be/oFy62n6lTwA?si=Ykkfe9Seg_yVihkj
	
}         


class savingsAccount extends Account{
	
	private int depositmo;
	private int withdrawmo;
	private int fixeddepositmo;
	
	public void setDepositmo(int depositmo) {
		this.depositmo = depositmo;}

	public void setWithdrawmo(int withdrawmo) {
		this.withdrawmo = withdrawmo;}

	public void setFixeddepositmo(int fixeddepositmo) {
		this.fixeddepositmo = fixeddepositmo;}	
	
	double deposit(){
	
		 return depositmo + balance;}
	double withdraw(){
		
		 return balance - withdrawmo;}
	double fixeddepo(){
		
		 return fixeddepositmo + 1000 + balance;}	
	
}


public class APractice {
	public static void main(String[] args) {
		savingsAccount mahi= new savingsAccount();
		Account kula= new Account(1906,"kuladeep","19/10/2000",50000);
		kula.setAddress("jnp");
		kula.setPhno(9143143);
		mahi.setDepositmo(35430);
		System.out.println(kula.getAccNo());
		System.out.println(mahi.deposit());	
	}	

}
