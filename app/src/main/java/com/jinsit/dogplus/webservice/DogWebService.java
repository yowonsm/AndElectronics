package com.jinsit.dogplus.webservice;

import android.content.Context;
import android.util.Log;

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
import java.util.HashMap;
import java.util.Hashtable;


public class DogWebService implements InterfaceDogService{
	private WebServiceClient WebServiceClient;
	//private static String LOGIN = "PDA_PKG_M02_TEST";
	//private static String PETLIST = "PDA_PKG_M03_TEST";
	//private static String PETREGISTER ="PDA_PKG_I02_TEST";
	private static String STORELIST = "PDA_PKG_M01";
	private static String LOGIN = "PDA_PKG_M02";
	private static String PETLIST = "PDA_PKG_M03";
	private static String CLSCODE = "PDA_PKG_M04";
	private static String ARS = "PDA_PKG_M05";
	private static String USERREGISTER = "PDA_PKG_I01";
	private static String PETREGISTER ="PDA_PKG_I02";
	
	
	//private Sysutil Sysutil = new Sysutil();
	private String message;
	private String code;
	
	private void setMessage(String value){
		message = value;
	}
	
	public String getMessage(){
		return this.message;
	}

	private void setCode(String value){
		code = value;
	}
	public String getCode(){
		return this.code;
	}
	
	public DogWebService(Context context){
	this.WebServiceClient = new WebServiceClient("http://asp.jinsit2.net:60027/DogWebService.asmx");
	   
	}
	
	
	
	public DogStoreListItemData getLogin(String storeNo, String scanCode ){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("EmpNo", storeNo);
		hashtable.put("Passwd", scanCode);
		hashtable.put("result", 0);
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(LOGIN, hashtable,  DogStoreListItemData.class,false);
		DogStoreListItemData pdaGoods = (DogStoreListItemData)output.get("output");
		
		Log.w("outputData", output.toString());
		
		Log.i("result", output.get(1).toString() +"???");
		
		//Log.v("errmsg", output.get(2).toString() + "???");
		
		if(pdaGoods == null){
			pdaGoods = new DogStoreListItemData();
		}
		this.setMessage(output.get(1).toString());
		//this.setCode(output.get(2).toString());
		return pdaGoods;
	}
	@Override
	public UserRegisterResData getUserRegister(
			UserRegisterRequestData requestData) {
		// TODO Auto-generated method stub
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable = requestData.getUserRegisterReqData();
	    hashtable.put("result", 0);
	    
	    hashtable.put("message", "");
		
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(USERREGISTER, hashtable,  UserRegisterResData.class,false);
		UserRegisterResData pdaGoods = (UserRegisterResData)output.get("output");
		Log.w("outputData", output.size() + "=size");
		if(output.size()==3){
			//����ó��
			Log.i("result", output.get(1).toString() +"=size3 ???");
			
			Log.v("errmsg", output.get(2).toString() + "???");
			this.setCode(output.get(1).toString());
			this.setMessage(output.get(2).toString());
		}else{
			Log.w("errmsg", output.get(1).toString() +"=size2 ???");
			this.setCode("1");
			this.setMessage(output.get(1).toString());
		}
		
	
		
		if(pdaGoods == null){
			pdaGoods = new UserRegisterResData();
		}
	
		return pdaGoods;
	}
	
	@Override
	public ArrayList<DogStoreListItemData> getStoreList(
			StoreRequestData requestData) {
		// TODO Auto-generated method stub
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable = requestData.getStoreListReqData();
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(STORELIST, hashtable,  DogStoreListItemData.class,true);
		ArrayList<DogStoreListItemData> pdaGoods = (ArrayList<DogStoreListItemData>)output.get("output");
		Log.i("result", output.get(1).toString() +"???");
		
		Log.v("errmsg", output.get(2).toString() + "???");
		if(pdaGoods == null){
			pdaGoods = new ArrayList<DogStoreListItemData>();
		}
		this.setCode(output.get(1).toString());
		//this.setMessage(output.get(2).toString());
		return pdaGoods;
	}
	public ArrayList<DogPetListItemData> getPetList(PetListRequestData requestData){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable = requestData.getPetListReqData();
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(PETLIST, hashtable,  DogPetListItemData.class,true);
		ArrayList<DogPetListItemData> pdaGoods = (ArrayList<DogPetListItemData>)output.get("output");
		Log.i("result", output.get(1).toString() +"???");
		
		//Log.v("errmsg", output.get(2).toString() + "???");
		if(pdaGoods == null){
			pdaGoods = new ArrayList<DogPetListItemData>();
		}
		this.setCode(output.get(1).toString());
		//this.setMessage(output.get(2).toString());
		return pdaGoods;
	}
	@Override
	public ArrayList<DogDepListItemData> getClsCode() {
		// TODO Auto-generated method stub
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(CLSCODE, hashtable,  DogDepListItemData.class,true);
		ArrayList<DogDepListItemData> pdaGoods = (ArrayList<DogDepListItemData>)output.get("output");
		Log.i("result", output.get(1).toString() +"???");
		
		Log.v("errmsg", output.get(2).toString() + "???");
		if(pdaGoods == null){
			pdaGoods = new ArrayList<DogDepListItemData>();
		}
		this.setCode(output.get(1).toString());
		//this.setMessage(output.get(2).toString());
		return pdaGoods;
	
	}
	
	public PetRegisterResData getPetRegister(PetRegisterRequestData requestData ){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
	  
		hashtable = requestData.getPetRegisterReqData();
	    hashtable.put("result", 0);
	    hashtable.put("RetItmCode", "");
	    hashtable.put("message", "");
		
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(PETREGISTER, hashtable,  PetRegisterResData.class,false);
		PetRegisterResData pdaGoods = (PetRegisterResData)output.get("output");
		Log.w("outputData", output.toString());
		
		Log.i("result", output.get(1).toString() +"???");
		
		Log.v("errmsg", output.get(2).toString() + "???");
		
		if(pdaGoods == null){
			pdaGoods = new PetRegisterResData();
		}
		this.setCode(output.get(1).toString());
		//this.setMessage(output.get(2).toString());
		return pdaGoods;
	}

	

	@Override
	public ArsResData getArsNo() {
		// TODO Auto-generated method stub
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice(ARS, hashtable,  ArsResData.class,false);
		ArsResData pdaGoods = (ArsResData)output.get("output");
		if(output.size()==3){
			//����ó��
			Log.i("result", output.get(1).toString() +"=size3 ???");
			
			Log.v("errmsg", output.get(2).toString() + "???");
			this.setCode(output.get(1).toString());
			this.setMessage(output.get(2).toString());
		}else{
			Log.w("errmsg", output.get(1).toString() +"=size2 ???");
			this.setCode("1");
			this.setMessage(output.get(1).toString());
		}
		if(pdaGoods == null){
			pdaGoods = new ArsResData();
		}
		this.setCode(output.get(1).toString());
		//this.setMessage(output.get(2).toString());
		return pdaGoods;
	
	}

	

	
	
	/*
	public PdaGoods getStockGoods(String stockDate, String storeNo,String storeGubun, String scanCode ){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("stockDate", stockDate);
		hashtable.put("storeNo", storeNo);
		hashtable.put("storeGubun", storeGubun);
		hashtable.put("scanCode", scanCode);
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice("getStockGoods", hashtable,  PdaGoods.class,false);
		PdaGoods pdaGoods = (PdaGoods)output.get("output");
		if(pdaGoods == null){
			pdaGoods = new PdaGoods();
		}
		if(output.size() >2){
			this.setMessage(output.get(2).toString());
		}else{
		this.setMessage(output.get(1).toString());
		}
		return pdaGoods;
	}
	
	public String insertStockGoods(PdaInventoryGoods pdaInventoryGoods ){
		this.setMessage("");
		HashMap output = new HashMap();
		String result = this.WebServiceClient.RequestWebservice("insertStockGoods", pdaInventoryGoods.getPdaInventoryGoodsData());
		return result;
	}
	
	public ArrayList<Vendor> getVendor(String storeNo){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("storeNo", storeNo);
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice("getVendorCode", hashtable,  Vendor.class,true);
		ArrayList<Vendor> vendor = (ArrayList<Vendor>)output.get("output");
		if(vendor == null){
			vendor = new ArrayList<Vendor>();
			this.setMessage(output.get(1).toString());
		}
		else if(vendor.size() == 0){
			this.setMessage("��ϵ� ����ó�� �����ϴ�.");
		}
		return vendor;
	}
	
	public ArrayList<PdaOrderListData> getOrderList(String storeNo,String fromDate,String toDate){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("storeNo", storeNo);
		hashtable.put("fromDate", fromDate);
		hashtable.put("toDate", toDate);
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice("getOrderList", hashtable,  PdaOrderListData.class,true);
		
        ArrayList<PdaOrderListData> orderTrxnList = (ArrayList<PdaOrderListData>)output.get("output");
		if(orderTrxnList == null){
			orderTrxnList = new ArrayList<PdaOrderListData>();
		}
		this.setMessage(output.get(1).toString());
		return orderTrxnList;
	}
	
	public ArrayList<PdaOrderListGoodsData> getOrderListGoods(String storeNo,long orderNo){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("storeNo", storeNo);
		hashtable.put("orderNo", orderNo);
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice("getOrderListGoods", hashtable,  PdaOrderListGoodsData.class,true);
		
        ArrayList<PdaOrderListGoodsData> orderTrxnGoodsList = (ArrayList<PdaOrderListGoodsData>)output.get("output");
		if(orderTrxnGoodsList == null){
			orderTrxnGoodsList = new ArrayList<PdaOrderListGoodsData>();
		}
		this.setMessage(output.get(1).toString());
		return orderTrxnGoodsList;
	}
	
	
	public ArrayList<PdaOrderGoods> getOrderGoods(String trxnType){
		this.setMessage("");
		ArrayList<PdaOrderGoods> PdaGoodsList = new ArrayList<PdaOrderGoods>();
		return PdaGoodsList;
	}
	
	public void insertOrderGoods(PdaOrderGoods pdaOrderGoods){
		
	}
	
	public void deleteOrderGoods(PdaOrderGoods pdaOrderGoods){
	}
	
	public void completeOrderGoods(String trxnType){
	}
	
	
	public void insertReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
	}
	
	public void completeReceivingGoods(String trxnType){
	}
	
	public void deleteReceivingGoods(PdaReceivingGoods pdaReceivingGoods){
	}
	
	public ArrayList<PdaReceivingGoods> getReceivingGoods(String trxnType){
		  return new ArrayList<PdaReceivingGoods>();
	}
	public ArrayList<PdaShowCardGoods> getShowCardGoods(){
		return new ArrayList<PdaShowCardGoods>();
	}
	public void insertShowCardGoods(PdaShowCardGoods pdaShowCardGoods){	}
	
	public void completeShowCardGoods(){
	}
	
	public void deleteShowCardGoods(PdaShowCardGoods pdaShowCardGoods){
	}
	public PdaGoods insertGoods(PdaGoods pdaGoods,String posNo,String empNo){
		this.setMessage("");
		Hashtable hashtable = new Hashtable();
		hashtable.put("message", "");
		HashMap output = new HashMap();
		output = this.WebServiceClient.RequestWebservice("insertGoods","GoodsData", hashtable,pdaGoods.getInsertGoodsTable(posNo, empNo), "goodsData",PdaGoods.class,false);
	
		PdaGoods pdaGoodsResult = (PdaGoods)output.get("output");
		this.setMessage(output.get(1).toString());
		return pdaGoodsResult;
	}*/

	
}
