package com.jinsit.dogplus.response;

import java.io.Serializable;

public class DogPetListItemData implements Serializable {

	private static final long serialVersionUID = 1L;
	public String ITM_CODE;
	public String STR_CODE;
	public String STR_NAME;
	public String ITM_NAME;
	public String CLS_CODE;
	public String CLS_NAME;
	public String DISPLAY_FG;
	public String SALE_FG;
	public String SALE_PRICE;
	public String AGE;
	public String SEX_FG;
	public String SEX_FG_NM;
	public String DESCRIPTION;
	public String IDATES;
	public String TEL_NO;
	public String HP_NO;
	public String ADDR1;
	public String ADDR2;
	public String LOST_FG;
	public String IMAGE_CNT;
	
	public DogPetListItemData(){

	}
	public String getItm_code(){
		return ITM_CODE; 
		
		
	}
	public void setItm_code(String itm_code){
		this.ITM_CODE = itm_code;
		
	}
	public String getStr_code(){
		return STR_CODE;
		
	}
	public void setStr_code(String str_code){
		this.STR_CODE = str_code;
		
	}
	public String getStr_name(){
		return STR_NAME;
		
	}
	public void setStr_name(String str_name){
		this.STR_NAME = str_name;
		
	}
	public String getItm_name(){
		return ITM_NAME;
		
	}
	public void setItm_name(String itm_name){
		this.ITM_NAME = itm_name;
		
	}
	public String getCls_code(){
		return CLS_CODE;
		
	}
	public void setCls_code(String cls_code){
		this.CLS_CODE = cls_code;
		
	}
	
	public String getCls_name(){
		return CLS_NAME;
		
	}
	public void setCls_name(String cls_name){
		this.CLS_NAME = cls_name;
		
	}
	
	public String getDisplay_fg(){
		return DISPLAY_FG;
		
	}
	public void setDisplay_fg(String display_fg){
		this.DISPLAY_FG = display_fg;
		
	}
	public String getSale_fg(){
		return SALE_FG;
		
	}
	public void setSale_fg(String sale_fg){
		this.SALE_FG = sale_fg;
		
	}
	public String getSale_price(){
		return SALE_PRICE;
		
	}
	public void setSale_price(String sale_price){
		this.SALE_PRICE = sale_price;
		
	}
	public String getAge(){
		return AGE;
		
	}
	public void setAge(String age){
		this.AGE = age;
		
	}
	public String getSex_fg(){
		return SEX_FG;
		
	}
	public void setSex_fg(String sex_fg){
		this.SEX_FG = sex_fg;
		
	}
	public String getSex_fg_nm(){
		return SEX_FG_NM;
		
	}
	public void setSex_fg_nm(String sex_fg_nm){
		this.SEX_FG_NM = sex_fg_nm;
		
	}
	public String getDescription(){
		return DESCRIPTION;
		
	}
	public void setDescription(String description){
		this.DESCRIPTION = description;
		
	}
	public String getIdates(){
		return IDATES;
		
	}
	public void setIdates(String idates){
		this.IDATES = idates;
		
	}
	
	public String getTel_no(){
		return TEL_NO;
		
	}
	public void setTel_no(String tel_no){
		this.TEL_NO = tel_no;
		
	}
	public String getHp_no(){
		return HP_NO;
		
	}
	public void setHp_no(String hp_no){
		this.HP_NO = hp_no;
		
	}
	public String getAddr1(){
		return ADDR1;
		
	}
	public void setAddr1(String addr1){
		this.ADDR1 = addr1;
		
	}
	public String getAddr2(){
		return ADDR2;
		
	}
	public void setAddr2(String addr2){
		this.ADDR2 = addr2;
		
	}
	public String getLost_fg() {
		return LOST_FG;
	}
	public void setLost_fg(String lost_fg) {
		LOST_FG = lost_fg;
	}
	public String getImage_cnt() {
		return IMAGE_CNT;
	}
	public void setImage_cnt(String image_cnt) {
		IMAGE_CNT = image_cnt;
	}
	
	
	
}
