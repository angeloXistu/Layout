package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class CalculoDeBalanceamento extends Activity {
	EditText showResult;
	public String str ="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculo_de_balanceamento);
        showResult = (EditText)findViewById(R.id.btnBalancear);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculo_de_balanceamento, menu);
		return true;
	}
	
    public void btBalancear(View v){
    str = "oi";
    showResult.setText(str);
    
    }

}
