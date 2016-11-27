package com.jinsit.dogplus.common;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SdcardNomedia {

	
public static void noMedia(){
	
	File dir = new File(Environment.getExternalStorageDirectory()
			.getAbsolutePath(), "/DogPlus/");

	if (!dir.exists()) {
		dir.mkdirs();
		Log.w("NoDirec", "dir Create");
	}
	File nomediaFile = new File("/mnt/sdcard/DogPlus/.nomedia");
	Log.e("clipxclip","nomediaexist" + nomediaFile.exists()+ "");
	if (nomediaFile.exists() == false) { 
	
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("/mnt/sdcard/DogPlus/.nomedia");
			try {
				//out.fl
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
}
