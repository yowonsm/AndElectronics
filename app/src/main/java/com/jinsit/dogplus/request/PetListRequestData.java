package com.jinsit.dogplus.request;

import java.util.Hashtable;

public class PetListRequestData {

	public PetListRequestData(){
		this.StoreCode="";
		this.ItmName="";
		this.ClsCode="";
		this.SexFlg="";
		this.Age="";
		this.PriceFrom="0";
		this.PriceTo="999999999999";
	}
	
	public String StoreCode;
	public String getStoreCode(){
		return this.StoreCode;
	}
	public void setStoreCode(String value){
		this.StoreCode = value;
	}
	
			
	public String ItmName;
	public String getItmName(){
		return this.ItmName;
	}
	public void setItmName(String value){
		this.ItmName = value;
	}
	
	public String ClsCode;
	public String getClsCode(){
		return this.ClsCode;
	}
	public void setClsCode(String value){
		this.ClsCode = value;
	}
	
	public String SexFlg;
	public String getSexFlg() {
		return SexFlg;
	}
	public void setSexFlg(String sexFlg) {
		SexFlg = sexFlg;
	}
	public String Age;
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String PriceFrom;
	public String getPriceFrom() {
		return PriceFrom;
	}
	public void setPriceFrom(String priceFrom) {
		PriceFrom = priceFrom;
	}
	public String PriceTo;
	public String getPriceTo() {
		return PriceTo;
	}
	public void setPriceTo(String priceTo) {
		PriceTo = priceTo;
	}

	
	public Hashtable getPetListReqData(){
		Hashtable hashtable = new Hashtable();
		hashtable.put("StoreCode", this.getStoreCode());
		hashtable.put("ItmName", this.getItmName());
		hashtable.put("ClsCode", this.getClsCode());
		hashtable.put("SexFlg", this.getSexFlg());
		hashtable.put("Age", this.getAge());
		hashtable.put("PriceFrom", this.getPriceFrom());
		hashtable.put("PriceTo", this.getPriceTo());
		return hashtable;
	}
}