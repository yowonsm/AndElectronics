package com.jinsit.dogplus.response;
/*
 * ���帮��Ʈ ����
 */
public class DogDepListItemData {

	public String DEP_CODE;
	public String DEP_NAME;
	public String LIN_CODE;
	public String LIN_NAME;
	public String CLS_CODE;
	public String CLS_NAME;
	
	
	public DogDepListItemData(){
		
	}
	public String getDep_code(){
		return DEP_CODE;
		
	}
	public void setDep_code(String dep_code){
		this.DEP_CODE = dep_code;
		
	}
	public String getDep_name(){
		return DEP_NAME;
		
	}
	public void setDep_name(String dep_name){
		this.DEP_NAME = dep_name;
		
	}
	public String getLin_code() {
		return LIN_CODE;
	}
	public void setLin_code(String lin_code) {
		LIN_CODE = lin_code;
	}
	public String getLin_name() {
		return LIN_NAME;
	}
	public void setLin_name(String lin_name) {
		LIN_NAME = lin_name;
	}
	public String getCls_code() {
		return CLS_CODE;
	}
	public void setCls_code(String cls_code) {
		CLS_CODE = cls_code;
	}
	public String getCls_name() {
		return CLS_NAME;
	}
	public void setCls_name(String cls_name) {
		CLS_NAME = cls_name;
	}
	
	public <ArrayList>String dep(){
			
		return DEP_CODE;
		
	}
	
	public <ArrayList>String lin(){
		return CLS_CODE;
		
	}
	
	public <ArrayList>String cls(){
		return LIN_CODE;
		
	}

	
	
}
