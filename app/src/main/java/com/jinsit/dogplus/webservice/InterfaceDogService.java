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


public interface InterfaceDogService {
	public DogStoreListItemData getLogin(String storeNo, String scanCode);
	public UserRegisterResData getUserRegister(UserRegisterRequestData requestData);
	public ArrayList<DogPetListItemData> getPetList(PetListRequestData requestData);
	public ArrayList<DogStoreListItemData> getStoreList(StoreRequestData requestData);
	public PetRegisterResData getPetRegister(PetRegisterRequestData requestData);
	public ArrayList<DogDepListItemData> getClsCode();
	public ArsResData getArsNo();
	public String getMessage();
	public String getCode();
	/*public ArrayList<Vendor> getVendor(String storeNo);
	public ArrayList<PdaOrderGoods> getOrderGoods(String trxnType);
	public void insertOrderGoods(PdaOrderGoods pdaOrderGoods);
	public void deleteOrderGoods(PdaOrderGoods pdaOrderGoods);
	public void completeOrderGoods(String trxnType);
	public void insertReceivingGoods(PdaReceivingGoods pdaReceivingGoods);
	public void completeReceivingGoods(String trxnType);
	public void deleteReceivingGoods(PdaReceivingGoods pdaReceivingGoods);
	public ArrayList<PdaReceivingGoods> getReceivingGoods(String trxnType);
	public PdaGoods getStockGoods(String stockDate, String storeNo,String storeGubun, String scanCode );
	public String insertStockGoods(PdaInventoryGoods pdaInventoryGoods );
	public String getMessage();
	public ArrayList<PdaOrderListData> getOrderList(String storeNo,String fromDate,String toDate);
	public ArrayList<PdaOrderListGoodsData> getOrderListGoods(String storeNo,long orderNo);
	public ArrayList<PdaShowCardGoods> getShowCardGoods();
	
	public void insertShowCardGoods(PdaShowCardGoods pdaShowCardGoods);
	
	public void completeShowCardGoods();
	
	public void deleteShowCardGoods(PdaShowCardGoods pdaShowCardGoods);
	public PdaGoods insertGoods(PdaGoods pdaGoods,String posNo,String empNo);*/
}
