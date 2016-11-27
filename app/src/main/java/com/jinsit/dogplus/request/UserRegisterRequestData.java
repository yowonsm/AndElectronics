package com.jinsit.dogplus.request;

import java.util.Hashtable;

public class UserRegisterRequestData {

	public String UserId;
	public String StrCode;
	public String StrName;
	public String BusiNo;
	public String OwnName;
	public String UpJong;
	public String UpTea;
	public String TelNo;
	public String PostNo;
	public String Addr1;
	public String Addr2;
	public String UserName;
	public String HpNo;
	public String Passwd;
	public String PosiX;
	public String PosiY;
	public String ActionFg;
	public UserRegisterRequestData(){
		this.UserId="";
		this.StrCode="";
		this.StrName="";
		this.BusiNo="";
		this.OwnName="";
		this.UpJong="";
		this.UpTea="";
		this.TelNo="";
		this.PostNo="";
		this.Addr1="";
		this.Addr2="";
		this.UserName="";
		this.HpNo="";
		this.Passwd="";
		this.PosiX="";
		this.PosiY="";
		this.ActionFg="";
		
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	public String getStrName() {
		return StrName;
	}
	public void setStrName(String strName) {
		this.StrName = strName;
	}
	public String getBusiNo() {
		return BusiNo;
	}
	public void setBusiNo(String busiNo) {
		this.BusiNo = busiNo;
	}
	public String getOwnName() {
		return OwnName;
	}
	public void setOwnName(String ownName) {
		this.OwnName = ownName;
	}
	public String getUpJong() {
		return UpJong;
	}
	public void setUpJong(String upJong) {
		this.UpJong = upJong;
	}
	public String getUpTea() {
		return UpTea;
	}
	public void setUpTea(String upTea) {
		this.UpTea = upTea;
	}
	public String getTelNo() {
		return TelNo;
	}
	public void setTelNo(String telNo) {
		this.TelNo = telNo;
	}
	public String getPostNo() {
		return PostNo;
	}
	public void setPostNo(String postNo) {
		this.PostNo = postNo;
	}
	public String getAddr1() {
		return Addr1;
	}
	public void setAddr1(String addr1) {
		this.Addr1 = addr1;
	}
	public String getAddr2() {
		return Addr2;
	}
	public void setAddr2(String addr2) {
		this.Addr2 = addr2;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getHpNo() {
		return HpNo;
	}
	public void setHpNo(String hpNo) {
		this.HpNo = hpNo;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		this.Passwd = passwd;
	}
	public String getPosiX() {
		return PosiX;
	}
	public void setPosiX(String posiX) {
		this.PosiX = posiX;
	}
	public String getPosiY() {
		return PosiY;
	}
	public void setPosiY(String posiY) {
		this.PosiY = posiY;
	}
	
	public String getStrCode() {
		return StrCode;
	}
	public void setStrCode(String strCode) {
		this.StrCode = strCode;
	}
	public String getActionFg() {
		return ActionFg;
	}
	public void setActionFg(String actionFg) {
		ActionFg = actionFg;
	}
	
	
	
	public Hashtable getUserRegisterReqData(){
		Hashtable hashtable = new Hashtable();
		hashtable.put("UserId", this.getUserId());
		hashtable.put("StrCode", this.getStrCode());
		hashtable.put("StrName", this.getStrName());
		hashtable.put("BusiNo", this.getBusiNo());
		hashtable.put("OwnName", this.getOwnName());
		hashtable.put("UpJong", this.getUpJong());
		hashtable.put("UpTea", this.getUpTea());
		hashtable.put("TelNo", this.getTelNo());
		hashtable.put("PostNo", this.getPostNo());
		hashtable.put("Addr1", this.getAddr1());
		hashtable.put("Addr2", this.getAddr2());
		hashtable.put("UserName", this.getUserName());
		hashtable.put("HpNo", this.getHpNo());
		hashtable.put("Passwd", this.getPasswd());
		hashtable.put("PosiX", this.getPosiX());
		hashtable.put("PosiY", this.getPosiY());
		hashtable.put("ActionFg", this.getActionFg());
		
		//hashtable.put("message", "");
		return hashtable;
	}

	
}
