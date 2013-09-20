package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	Button btCalcularBalanceamento, bttela3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCalcularBalanceamento = (Button) findViewById(R.id.btCalcularBalanceamento);
        btCalcularBalanceamento.setOnClickListener(new View.OnClickListener() {
        	 
        	@Override
        	public void onClick(View arg0) {
        	 
        	Intent trocatela = new
        	Intent(MainActivity.this,MainActivity.class);
        	MainActivity.this.startActivity(trocatela);
        	MainActivity.this.finish();
        	 
        	}
        	});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    
}
