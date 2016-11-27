package com.jinsit.dogplus.parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class JsonParser {
	public static Object parser(String result, Object output) {
		 Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		 JSONObject jObj;
		 try {
			jObj = new JSONObject(result);
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		 String value ="";
		for(Field field : fields){
			 try {
				 value = jObj.getString(field.getName());
				 if(value.equals("null")){
					 value = "";
				 }
				 field.set(output, value);
			}catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return output;
	}
	
	public static Object parser(String result, Object output, String text) {
		 Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		 JSONObject jObj;
		 try {
			jObj = new JSONObject(result);
			if(jObj.getBoolean("success")){
			jObj = new JSONObject(jObj.getString(text));
			}
			else{
				return null;
			}
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		 String value ="";
			for(Field field : fields){
				 try {
					 value = jObj.getString(field.getName());
					 if(value.equals("null")){
						 value = "";
					 }
					 field.set(output, value);
				}catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 return output;
	}
	
	public static ArrayList<Object> parserArray(String result, Object output, String text) {
		 Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		 JSONArray jObjArray;
		 JSONObject jObj;
		 
		 try {
			jObj = new JSONObject(result);
			if(jObj.getBoolean("success")){
				jObjArray = new JSONArray(jObj.getString(text));
			}
			else{
				return null;
			}
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		 String value ="";
		 int length = jObjArray.length();
		 ArrayList<Object> ouputs = new ArrayList<Object>();
		 for(int i=0; i < length ;i++)
		 {
			 try {
				output = theClass.newInstance();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			for(Field field : fields){
				 try {
					 value = jObjArray.getJSONObject(i).getString(field.getName());
					 if(value.equals("null")){
						 value = "";
					 }
					 field.set(output, value);
				}catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 ouputs.add(output);
		 }
		 return ouputs;
	}
}
