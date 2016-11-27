package com.jinsit.dogplus.request;

import java.util.Hashtable;

public class PetRegisterRequestData {

	public PetRegisterRequestData(){
		this.Image1 ="";
		this.Image2 ="";
		this.Image3 ="";
		this.Image4 ="";
		this.Image5 ="";
		this.ItmCode="";
		this.StrCode="";
		this.ItmName="";
		this.ClsCode="";
		this.DisPlayFg="";
		this.SaleFg="";
		this.SalePrice="";
		this.Age="";
		this.SexFg="";
		this.LostFg="";
		this.ImageCnt="";
		this.Description="";
		this.ActionFg="";
		
		
	}/*
	public String EmpNo;
	public String getEmpNo(){
		return this.EmpNo;
	}
	public void setEmpNo(String value){
		this.EmpNo = value;
	}
	public String Passwd;
	public String getPasswd(){
		return this.Passwd;
	}
	public void setPasswd(String value){
		this.Passwd = value;
	}*/
	public String ItmCode;
	public String getItmCode(){
		return this.ItmCode;
	}
	public void setItmCode(String value){
		this.ItmCode = value;
	}
	
			
	public String ItmName;
	public String getItmName(){
		return this.ItmName;
	}
	public void setItmName(String value){
		this.ItmName = value;
	}
	
	public String StrCode;
	public String getStrCode(){
		return this.StrCode;
	}
	public void setStrCode(String value){
		this.StrCode = value;
	}
	public String ClsCode;
	public String getClsCode(){
		return this.ClsCode;
	}
	public void setClsCode(String value){
		this.ClsCode = value;
	}
	public String DisPlayFg;
	public String getDisPlayFg(){
		return this.DisPlayFg;
	}
	public void setDisPlayFg(String value){
		this.DisPlayFg = value;
	}
	public String SaleFg;
	public String getSaleFg(){
		return this.SaleFg;
	}
	public void setSaleFg(String value){
		this.SaleFg = value;
	}
	public String SalePrice;
	public String getSalePrice(){
		return this.SalePrice;
	}
	public void setSalePrice(String value){
		this.SalePrice = value;
	}
	public String Age;
	public String getAge(){
		return this.Age;
	}
	public void setAge(String value){
		this.Age = value;
	}
	public String SexFg;
	public String getSexFg(){
		return this.SexFg;
	}
	public void setSexFg(String value){
		this.SexFg = value;
	}
	public String Description;
	public String getDescription(){
		return this.Description;
	}
	public void setDescription(String value){
		this.Description = value;
	}
	public String ActionFg;
	public String getActionFg(){
		return this.ActionFg;
	}
	public void setActionFg(String value){
		this.ActionFg = value;
	}
	
	/*public byte[] Image;
	public byte[] getImage(){
		return this.Image;
	}
	public void setImage(byte[] img){
		this.Image = img;
	}*/
	//public String Image;
	public void setImage(int seq,String img){
		
		switch(seq){
		case 0:
			setImage1(img);
		break;
		case 1:
			setImage2(img);
			break;
		case 2:
			setImage3(img);
			break;
			case 3:
				setImage4(img);
				break;
				
			case 4:
				setImage5(img);
				break;
				
		}
	}
	public String Image1;
	public String getImage1(){
		return this.Image1;
	}
	public void setImage1(String img){
		this.Image1 = img;
	}
	public String Image2;
	public String getImage2(){
		return this.Image2;
	}
	public void setImage2(String img){
		this.Image2 = img;
	}
	public String Image3;
	public String getImage3(){
		return this.Image3;
	}
	public void setImage3(String img){
		this.Image3 = img;
	}
	public String Image4;
	public String getImage4(){
		return this.Image4;
	}
	public void setImage4(String img){
		this.Image4 = img;
	}
	public String Image5;
	public String getImage5(){
		return this.Image5;
	}
	public void setImage5(String img){
		this.Image5 = img;
	}
	public String LostFg;
	public String getLostFg() {
		return LostFg;
	}
	public void setLostFg(String lostFg) {
		LostFg = lostFg;
	}
	public String ImageCnt;
	public String getImageCnt() {
		return ImageCnt;
	}
	public void setImageCnt(String imageCnt) {
		ImageCnt = imageCnt;
	}
	
	public Hashtable getPetRegisterReqData(){
		Hashtable hashtable = new Hashtable();
		hashtable.put("ItmCode", this.getItmCode());
		hashtable.put("StrCode", this.getStrCode());
		hashtable.put("ItmName", this.getItmName());
		hashtable.put("ClsCode", this.getClsCode());
		hashtable.put("DisPlayFg", this.getDisPlayFg());
		hashtable.put("SaleFg", this.getSaleFg());
		hashtable.put("SalePrice", this.getSalePrice());
		hashtable.put("Age", this.getAge());
		hashtable.put("SexFg", this.getSexFg());
		hashtable.put("Description", this.getDescription());
		hashtable.put("ActionFg", this.getActionFg());
		hashtable.put("Image1", this.getImage1());
		hashtable.put("Image2", this.getImage2());
		hashtable.put("Image3", this.getImage3());
		hashtable.put("Image4", this.getImage4());
		hashtable.put("Image5", this.getImage5());
		hashtable.put("LostFg", this.getLostFg());
		hashtable.put("ImageCnt", this.getImageCnt());
		
		
		//hashtable.put("message", "");
		return hashtable;
	}

	
	
}