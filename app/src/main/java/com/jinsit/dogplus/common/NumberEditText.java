package com.jinsit.dogplus.common;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.widget.EditText;

public class NumberEditText extends EditText {

	public NumberEditText(Context context) {
		super(context);
	}
	
	public NumberEditText(Context context, AttributeSet attrs) {
		super(context,attrs);
		init();
	}
	
	public NumberEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	private SysUtil Sysutil= new SysUtil();
	private String _strAmount = "";
	
	private void init(){
		this.Sysutil = new SysUtil();
		_strAmount="";
	
	}
	
	protected void onTextChanged(CharSequence s, int start, int before,
								 int count) {
		this.Sysutil = new SysUtil();
		if (!s.toString().equals(_strAmount)) {
			_strAmount = this.Sysutil.makeStringWithComma(s.toString()
					.replace(",", ""), true);
			if(_strAmount == ""){
				_strAmount = "0";
			}
			this.setText(_strAmount);
			Editable e = this.getText();
			Selection.setSelection(e, _strAmount.length());
			
		}
	}
}
