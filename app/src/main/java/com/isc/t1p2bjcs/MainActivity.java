package com.isc.t1p2bjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText elige;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(this);
        elige=findViewById(R.id.editText);
    }
    @Override
    public void onClick(View view){
        Intent btn1=new Intent(this, frm2Activity.class);
        btn1.putExtra("operacion", Integer.parseInt(elige.getText().toString()));
        startActivity(btn1);
    }
}
