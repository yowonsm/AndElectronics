package com.jinsit.dogplus.webservice;

import android.content.Context;

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

public class DoubleInqueryDogService implements InterfaceDogService{
	private InterfaceDogService ServerService;
	private InterfaceDogService LocalService;
	
	public DoubleInqueryDogService(Context context){
		this.ServerService = new DogWebService(context);
		this.LocalService = new DogLocalService(context);
	}
	
	public DogStoreListItemData getLogin(String storeNo, String scanCode ){
		return this.ServerService.getLogin(storeNo, scanCode);
	}
	@Override
	public UserRegisterResData getUserRegister(
			UserRegisterRequestData requestData) {
		// TODO Auto-generated method stub
		return this.ServerService.getUserRegister(requestData);
	}

	public ArrayList<DogPetListItemData> getPetList(PetListRequestData requestData){
		return this.ServerService.getPetList(requestData);
	}
	@Override
	public PetRegisterResData getPetRegister(PetRegisterRequestData requestData) {
		// TODO Auto-generated method stub
		return this.ServerService.getPetRegister(requestData);
	}
	@Override
	public ArrayList<DogDepListItemData> getClsCode() {
		// TODO Auto-generated method stub
		return this.ServerService.getClsCode();
	}

	public String getMessage(){
		return this.ServerService.getMessage();
	}
	public String getCode(){
		return this.ServerService.getCode();
	}
	/*
	public ArrayList<Vendor> getVendor(String storeNo){
		return this.ServerService.getVendor(storeNo);
	}
	public ArrayList<PdaOrderGoods> getOrderGoods(String trxnType){
		return this.LocalService.getOrderGoods(trxnType);
	}
	public void insertOrderGoods(PdaOrderGoods pdaOrderGoods){
		this.LocalService.insertOrderGoods(pdaOrderGoods);
	}
	public void deleteOrderGoods(PdaOrderGoods pdaOrderGoods){
		this.LocalService.deleteOrderGoods(pdaOrderGoods);
	}
	public void completeOrderGoods(String trxnType){
		this.LocalService.completeOrderGoods(trxnType);
	}
	
	public void insertReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
		this.LocalService.insertReceivingGoods(pdaReceivingGoods);
	}
	
	public void completeReceivingGoods(String trxnType){
		this.LocalService.completeReceivingGoods(trxnType);
	}
	
	public void deleteReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
		this.LocalService.deleteReceivingGoods(pdaReceivingGoods);
	}
	public ArrayList<PdaReceivingGoods> getReceivingGoods(String trxnType){
		  return this.LocalService.getReceivingGoods(trxnType);
	}
	public PdaGoods getStockGoods(String stockDate, String storeNo,String storeGubun, String scanCode ){
		return this.ServerService.getStockGoods(stockDate, storeNo, storeGubun, scanCode);
	}
	public String insertStockGoods(PdaInventoryGoods pdaInventoryGoods ){
		return this.ServerService.insertStockGoods(pdaInventoryGoods);
		
	}
	public String getMessage(){
		return this.ServerService.getMessage();
	}
	public ArrayList<PdaOrderListData> getOrderList(String storeNo,String fromDate,String toDate){
		return this.ServerService.getOrderList(storeNo, fromDate, toDate);
	}
	public ArrayList<PdaOrderListGoodsData> getOrderListGoods(String storeNo,long orderNo){
		return this.ServerService.getOrderListGoods(storeNo, orderNo);
	}
	public ArrayList<PdaShowCardGoods> getShowCardGoods(){
		return this.LocalService.getShowCardGoods();
	}
	
	
	public void insertShowCardGoods(PdaShowCardGoods pdaShowCardGoods){
		this.LocalService.insertShowCardGoods(pdaShowCardGoods);
		}
	
	public void completeShowCardGoods(){
		this.LocalService.completeShowCardGoods();
	}
	
	public void deleteShowCardGoods(PdaShowCardGoods pdaShowCardGoods){
		this.LocalService.deleteShowCardGoods(pdaShowCardGoods);
	}
	
	public PdaGoods insertGoods(PdaGoods pdaGoods,String posNo,String empNo){
		return this.ServerService.insertGoods(pdaGoods,posNo,empNo);
	}*/

	
	@Override
	public ArrayList<DogStoreListItemData> getStoreList(
			StoreRequestData requestData) {
		// TODO Auto-generated method stub
		return this.ServerService.getStoreList(requestData);
	}

	@Override
	public ArsResData getArsNo() {
		// TODO Auto-generated method stub
		return this.ServerService.getArsNo();
	}

	
	

}
