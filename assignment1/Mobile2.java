package assignment1;

public class Mobile2 
{
	String mobileBrandName="vivo";
	char mobilelogo='V';
	short noOfMobilePiece=4;
	int modelNumber=6;
	long imeiNumber=9087920092090600l;
	float mobilePrice=15999.99f;
	boolean isDamaged=false;
	
	
	public static void main(String[] args) 
	{
		Mobile2 mob=new Mobile2();
		System.out.println("mobileBrandName="+mob.mobileBrandName);
		System.out.println("mobileLogo="+mob.mobilelogo);
		System.out.println("noOfMobilePiece="+mob.noOfMobilePiece);
		System.out.println("modealNumber="+mob.modelNumber);
		System.out.println("imeiNumber="+mob.imeiNumber);
		System.out.println("mobilePrice="+mob.mobilePrice);
		System.out.println("isDamaged="+mob.isDamaged);
		
	}
}
