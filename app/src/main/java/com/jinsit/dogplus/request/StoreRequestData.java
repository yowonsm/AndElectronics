package com.jinsit.dogplus.request;

import java.util.Hashtable;

public class StoreRequestData {
	public String PosiX;
	public String PosiY;
	public String Distance;
	public StoreRequestData(){
		this.PosiX="";
		this.PosiY="";
		this.Distance="";
	
	}
	public String getPosiX() {
		return PosiX;
	}
	public void setPosiX(String posiX) {
		PosiX = posiX;
	}
	public String getPosiY() {
		return PosiY;
	}
	public void setPosiY(String posiY) {
		PosiY = posiY;
	}
	public String getDistance() {
		return Distance;
	}
	public void setDistance(String distance) {
		Distance = distance;
	}
	
	
	public Hashtable getStoreListReqData(){
		Hashtable hashtable = new Hashtable();
		hashtable.put("PosiX", this.getPosiX());
		hashtable.put("PosiY", this.getPosiY());
		hashtable.put("Distance", this.getDistance());
		
		
		//hashtable.put("message", "");
		return hashtable;
	}
}
