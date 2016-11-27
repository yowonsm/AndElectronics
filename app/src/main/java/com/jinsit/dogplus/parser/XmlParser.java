package com.jinsit.dogplus.parser;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class XmlParser {

	
	public static Object parser(XmlPullParser parser, Object output, String text) {
		Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		
		 String tag = null;
		 String value ="";
		 try {
				int parserEvent = parser.getEventType();
				while (parserEvent != XmlPullParser.END_DOCUMENT) {
					switch (parserEvent) {
					case XmlPullParser.START_DOCUMENT:
						break;
					case XmlPullParser.END_DOCUMENT:
						break;
					
					case XmlPullParser.START_TAG:
						tag = parser.getName();
						if(text.equals(tag)){
							output = theClass.newInstance();
						}
						break;
					case XmlPullParser.END_TAG:
						/*tag = parser.getName();
						if(text.equals(tag)){
							 ouputs.add(output);
						}*/
						break;
					case XmlPullParser.TEXT:
						
						for(Field field : fields){
							 try {
								 if(tag.equals(field.getName())){
									value = parser.getText().trim();
									 if(!value.equals(""))field.set(output, value);
								 }
								
								 if(value.equals("null")){
									 value = "";
								 }
								
							}catch (IllegalArgumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						 }
						
						break;
					}
					parserEvent = parser.next();
					
				}
				
			} catch (Exception e) {
				Log.d("BusStationXMLParser", e.getMessage());
			}
		 return output;
	}
	
	public static ArrayList<Object> parserArray(XmlPullParser parser, Object output, String text) {
		 Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		
		 String tag = null;
		 String value ="";
		 
		 ArrayList<Object> ouputs = new ArrayList<Object>();
		 try {
				int parserEvent = parser.getEventType();
				int tagIdentifier = -1;
				boolean itemTag = false;
			
				while (parserEvent != XmlPullParser.END_DOCUMENT) {
					switch (parserEvent) {
					case XmlPullParser.START_DOCUMENT:
						break;
					case XmlPullParser.END_DOCUMENT:
						break;
					
					case XmlPullParser.START_TAG:
						tag = parser.getName();
					
						if("PDA_PKG_M01_Pair".equals(tag)){
							output = theClass.newInstance();
						
						} else if (tag.equals("USER_ID")) {
							tagIdentifier = 0;
						} else if (tag.equals("STR_CODE")) {
							tagIdentifier = 1;
						} else if (tag.equals("STR_NAME")) {
							tagIdentifier = 2;
						}else if(tag.equals("BUSI_NO")){
							tagIdentifier = 3;
						}else if(tag.equals("OWN_NAME")){
							tagIdentifier = 4;
						}else if(tag.equals("UPJONG")){
							tagIdentifier = 5;
						}else if(tag.equals("UPTEA")){
							tagIdentifier = 6;
						}else if(tag.equals("TEL_NO")){
							tagIdentifier = 7;
						}else if(tag.equals("USER_NAME")){
							tagIdentifier = 8;
						}else if(tag.equals("HP_NO")){
							tagIdentifier = 9;
						}
						else if(tag.equals("PASSWD")){
							tagIdentifier = 10;
						}else if(tag.equals("APP_FG")){
							tagIdentifier = 11;
						}else if(tag.equals("POSI_X")){
							tagIdentifier = 12;
						}else if(tag.equals("POSI_Y")){
							tagIdentifier = 13;
						}
						
						break;
					case XmlPullParser.END_TAG:
						tag = parser.getName();
						
						if("PDA_PKG_M01_Pair".equals(tag)){
							 ouputs.add(output);
						}
						
						break;
					case XmlPullParser.TEXT:
				
						if (tagIdentifier == 0) {
							fields.equals("");
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.w("BusStationXMLResult",value);
						}else if (tagIdentifier == 1) {
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.w("BusStationXMLResult",value);
						} else if (tagIdentifier == 2) {
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.d("BusStationXMLResult", value);
						} else if (tagIdentifier == 3) {
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.e("BusStationXMLResult",value);
						} else if (tagIdentifier == 4) {
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.i("BusStationXMLResult",value);
						}else if(tagIdentifier ==5){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==6){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==7){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==8){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==9){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==10){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							field.set(output, value);
							Log.v("BusStationXMLResult",value);
						}
						else if(tagIdentifier ==11){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							Log.v("BusStationXMLResult",value);
							field.set(output, value);
							
						}
						else if(tagIdentifier ==12){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							Log.v("BusStationXMLResult",value);
							field.set(output, value);
							
						}
						else if(tagIdentifier ==13){
							Field field = fields[tagIdentifier];
							value = parser.getText().trim();
							Log.v("BusStationXMLResult",value);
							field.set(output, value);
							
						}
						
					
						tagIdentifier = -1;
						break;
					}
					parserEvent = parser.next();
					
				}
				
			} catch (Exception e) {
				Log.d("BusStationXMLParser", e.getMessage());
			}
	
		 return ouputs;
	}
	
	
	public static ArrayList<Object> parserArray2(XmlPullParser parser, Object output, String text) {
		 Class theClass = output.getClass();
		 Field[] fields = theClass.getDeclaredFields();
		
		 String tag = null;
		 String value ="";
		 
		 ArrayList<Object> ouputs = new ArrayList<Object>();
		 try {
				int parserEvent = parser.getEventType();
				while (parserEvent != XmlPullParser.END_DOCUMENT) {
					switch (parserEvent) {
					case XmlPullParser.START_DOCUMENT:
						break;
					case XmlPullParser.END_DOCUMENT:
						break;
					
					case XmlPullParser.START_TAG:
						tag = parser.getName();
						if(text.equals(tag)){
							output = theClass.newInstance();
						}
						break;
					case XmlPullParser.END_TAG:
						tag = parser.getName();
						if(text.equals(tag)){
							 ouputs.add(output);
						}
						break;
					case XmlPullParser.TEXT:
						
						for(Field field : fields){
							 try {
								 if(tag.equals(field.getName())){
									value = parser.getText().trim();
									 if(!value.equals(""))field.set(output, value);
								 }
								
								 if(value.equals("null")){
									 value = "";
								 }
								
							}catch (IllegalArgumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						 }
						
						break;
					}
					parserEvent = parser.next();
					
				}
				
			} catch (Exception e) {
				Log.d("BusStationXMLParser", e.getMessage());
			}
	
		 return ouputs;
	}
}
