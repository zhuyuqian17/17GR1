package com.theftproofdoor;

public class TheftProofDoor extends Door implements Locker{

	public String lock() {
		return "door lock leeeeeeeeeeeeeeeeeee";

	}

	public String unlock() {
		// TODO Auto-generated method stub
		return "door unlock leeeeeeeeeeeeeeeeeee";
	}

	public static void main(String[] args){
		TheftProofDoor tpd = new TheftProofDoor();
		syso( tpd.close());
		
		syso(tpd.lock());
		
		
		syso(tpd.unlock());
		syso(tpd.open());
		
		
		
		
	}
	
	
	
	
}
