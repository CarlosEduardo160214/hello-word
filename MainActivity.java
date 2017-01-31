package com.example.eduardo.compras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox cha = (CheckBox) findViewById(R.id.charroz);
        final CheckBox chl = (CheckBox) findViewById(R.id.chleite);
        final CheckBox chc = (CheckBox) findViewById(R.id.chcarne);
        final CheckBox chf = (CheckBox) findViewById(R.id.chfeijao);

        Button btntotal = (Button) findViewById(R.id.button);

        btntotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double t=0;

                if(cha.isChecked())
                {
                    t += 2.69;
                }
                if(chl.isChecked())
                {
                    t+= 5.00;
                }
                if(chc.isChecked())
                {
                    t+= 9.70;
                }
                if(chf.isChecked())
                {
                    t+= 2.70;
                }


                Toast.makeText(MainActivity.this,"Valor total da compra é:"+String.valueOf(t),Toast.LENGTH_LONG).show();
            }
        });

    }
}
