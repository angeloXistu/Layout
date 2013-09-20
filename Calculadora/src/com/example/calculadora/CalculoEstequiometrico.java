package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CalculoEstequiometrico extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculo_estequiometrico);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculo_estequiometrico, menu);
		return true;
	}

}
