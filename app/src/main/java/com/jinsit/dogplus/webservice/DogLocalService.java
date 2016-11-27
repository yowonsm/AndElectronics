package com.jinsit.dogplus.webservice;

import com.jinsit.dogplus.request.PetListRequestData;
import com.jinsit.dogplus.request.PetRegisterRequestData;
import com.jinsit.dogplus.request.StoreRequestData;
import com.jinsit.dogplus.request.UserRegisterRequestData;
import com.jinsit.dogplus.response.ArsResData;
import com.jinsit.dogplus.response.DogDepListItemData;
import com.jinsit.dogplus.response.DogPetListItemData;
import com.jinsit.dogplus.response.DogStoreListItemData;
import com.jinsit.dogplus.response.PetRegisterResData;
import com.jinsit.dogplus.response.UserRegisterResData;

import java.util.ArrayList;

public class DogLocalService implements InterfaceDogService{
	
	private android.content.Context Context;

	
	public DogLocalService(android.content.Context context){
		this.Context = context;
	
	}
	public DogStoreListItemData getLogin(String storeNo, String scanCode ){
		return new DogStoreListItemData();
	}
	@Override
	public UserRegisterResData getUserRegister(
			UserRegisterRequestData requestData) {
		// TODO Auto-generated method stub
		return new UserRegisterResData();
	}
	@Override
	public ArrayList<DogPetListItemData> getPetList(PetListRequestData requestData) {
		// TODO Auto-generated method stub
		return new ArrayList<DogPetListItemData>();
	}
	@Override
	public PetRegisterResData getPetRegister(PetRegisterRequestData requestData) {
		// TODO Auto-generated method stub
		return new PetRegisterResData();
	}

	@Override
	public ArrayList<DogDepListItemData> getClsCode() {
		// TODO Auto-generated method stub
		return new ArrayList<DogDepListItemData>();
	}

	public String getMessage(){
		return "";
	}
	public String getCode(){
		return "";
	}
	/*
	public ArrayList<Vendor> getVendor(String storeNo){
		return new ArrayList<Vendor>();
	}
	
	public ArrayList<PdaOrderGoods> getOrderGoods(String trxnType){
		 Map param = new HashMap();
		 param.put("trxnType", trxnType);
		  ArrayList<PdaOrderGoods> pdaOrderGoodsList =(ArrayList<PdaOrderGoods>)this.Jbatis.executeForList("getpdaordergoods",param,PdaOrderGoods.class);
		  return pdaOrderGoodsList;
	}
	
	
	public void insertOrderGoods(PdaOrderGoods pdaOrderGoods){
		this.Jbatis.execute("insertpdaordergoods",pdaOrderGoods.getPdaOrderGoodsMap());
	}
	
	public void completeOrderGoods(String trxnType){
		 Map param = new HashMap();
		 param.put("trxnType", trxnType);
		this.Jbatis.execute("completeordergoods",param);
	}
	
	public void deleteOrderGoods(PdaOrderGoods pdaOrderGoods){
		 Map param = new HashMap();
		 param.put("orderno", pdaOrderGoods.getOrderNo());
		 param.put("num", pdaOrderGoods.getNum());
		 param.put("trxnType", pdaOrderGoods.getTrxnType());
		 this.Jbatis.execute("deletepdaordergoods",param);
	}
	
	public ArrayList<PdaReceivingGoods> getReceivingGoods(String trxnType){
		 Map param = new HashMap();
		 param.put("trxnType", trxnType);
		  ArrayList<PdaReceivingGoods> pdaReceivingGoodsList =(ArrayList<PdaReceivingGoods>)this.Jbatis.executeForList("getpdareceivinggoods",param,PdaReceivingGoods.class);
		  return pdaReceivingGoodsList;
	}
	
	
	public void insertReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
		this.Jbatis.execute("insertpdareceivinggoods",pdaReceivingGoods.getPdaReceivingGoodsMap());
	}
	
	public void completeReceivingGoods(String trxnType){
		 Map param = new HashMap();
		 param.put("trxnType", trxnType);
		this.Jbatis.execute("completereceivinggoods",param);
	}
	
	public void deleteReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
		 Map param = new HashMap();
		 param.put("receivingno", pdaReceivingGoods.getReceivingNo());
		 param.put("num", pdaReceivingGoods.getNum());
		 param.put("trxnType", pdaReceivingGoods.getTrxnType());
		 this.Jbatis.execute("deletepdareceivinggoods",param);
	}
	
	public PdaGoods getStockGoods(String stockDate, String storeNo,String storeGubun, String scanCode ){
		return new PdaGoods();
	}
	
	public String insertStockGoods(PdaInventoryGoods pdaInventoryGoods ){
		return "";
	}
	
	public ArrayList<PdaOrderListData> getOrderList(String storeNo,String fromDate,String toDate){
		return new ArrayList<PdaOrderListData>();
	}
	
	public String getMessage(){
		return "";
	}
	public ArrayList<PdaOrderListGoodsData> getOrderListGoods(String storeNo,long orderNo){
		return new ArrayList<PdaOrderListGoodsData>();
	}
	
	
	public ArrayList<PdaShowCardGoods> getShowCardGoods(){
		 Map param = new HashMap();
		  ArrayList<PdaShowCardGoods> pdaShowCardGoodsList =(ArrayList<PdaShowCardGoods>)this.Jbatis.executeForList("getpdashowcardgoods",param,PdaShowCardGoods.class);
		  return pdaShowCardGoodsList;
	}
	
	
	public void insertShowCardGoods(PdaShowCardGoods pdaShowCardGoods){
		this.Jbatis.execute("insertpdashowcardgoods",pdaShowCardGoods.getpdaShowCardGoodsMap());
	}
	
	public void completeShowCardGoods(){
		 Map param = new HashMap();
		this.Jbatis.execute("completepdashowcardgoods",param);
	}
	
	public void deleteShowCardGoods(PdaShowCardGoods pdaShowCardGoods){
		 Map param = new HashMap();
		 param.put("scanCode", pdaShowCardGoods.getScanCode());
		 param.put("num", pdaShowCardGoods.getNum());
		 this.Jbatis.execute("deletepdashowcardgoods",param);
	}
	public PdaGoods insertGoods(PdaGoods pdaGoods,String posNo,String empNo){
		return new PdaGoods();
	}
*/
	
	
	@Override
	public ArrayList<DogStoreListItemData> getStoreList(
			StoreRequestData requestData) {
		// TODO Auto-generated method stub
		return new ArrayList<DogStoreListItemData>();
	}
	@Override
	public ArsResData getArsNo() {
		// TODO Auto-generated method stub
		return new ArsResData();
	}
	
	
	
}
