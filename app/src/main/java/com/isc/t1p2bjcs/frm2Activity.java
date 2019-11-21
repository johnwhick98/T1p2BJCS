package com.isc.t1p2bjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class frm2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText tx1;
    EditText tx2;
    TextView titulo;
    TextView resul;
    Button btn2;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);

        titulo=findViewById(R.id.textView8);
        tx1=findViewById(R.id.editText2);
        tx2=findViewById(R.id.editText3);
        resul=findViewById(R.id.textView11);
        Bundle ope=getIntent().getExtras();
        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        switch (ope.getInt("operacion")){
            case 1:
                titulo.setText("SUMA");
                break;
            case 2:
                titulo.setText("RESTA");
                break;
            case 3:
                titulo.setText("MULTIPLICACION");
                break;
            case 4:
                titulo.setText("DIVISION");
                break;
        }
    }

    @Override
    public void onClick(View view){
        Bundle ope=getIntent().getExtras();
        switch (ope.getInt("operacion")){
            case 1:
                resultado=(Integer.parseInt(tx1.getText().toString()))+(Integer.parseInt(tx2.getText().toString()));
                resul.setText("Resultado: "+resultado);
                break;
                case 2:
                    resultado=(Integer.parseInt(tx1.getText().toString()))-(Integer.parseInt(tx2.getText().toString()));
                    resul.setText(""+resultado);
                    break;
                case 3:
                    resultado=(Integer.parseInt(tx1.getText().toString()))*(Integer.parseInt(tx2.getText().toString()));
                    resul.setText(""+resultado);
                    break;
                case 4:
                    resultado=(Integer.parseInt(tx1.getText().toString()))/(Integer.parseInt(tx2.getText().toString()));
                    resul.setText(""+resultado);
                    break;
        }
    }
}
