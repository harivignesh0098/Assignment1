package assignment1;

public class TwoWheeler3 
{
	int noOfWheels=2;
	short noOfMirror=2;
	long chassisNo=11347200225l;
	boolean isPunctured=false;
	String bikeName="yamaha mt-15";
	double runningKm=155.77;
public static void main(String[] args) 
{
	
	TwoWheeler3 bike=new TwoWheeler3();
	System.out.println("noOfWheels="+bike.noOfWheels);
	System.out.println("noOfMirror="+bike.noOfMirror);
	System.out.println("chassisNumber="+bike.chassisNo);
	System.out.println("isPunctured="+bike.isPunctured);
	System.out.println("bikeName="+bike.bikeName);
	System.out.println("runningKm="+bike.runningKm);
}

}
