package com.kulshreshthaneha.lab02_texts;

import androidx.appcompat.app.AppCompatActivity;


import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submit1;
    EditText response1;
    TextView display1;

    Button submit2;
    TextView display2;
    int i;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit1=findViewById(R.id.clickName);
        response1=findViewById(R.id.editName);
        display1=findViewById(R.id.nameBox);

        submit2 = findViewById(R.id.cycleString);
        display2=findViewById(R.id.showString);
        Resources res = getResources();
        final String[] days = res.getStringArray(R.array.day_of_week);


        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.println("Hello mom");
                //Log.i("testButton","Hi dad! "+responseText.getText().toString());
                display1.setText(response1.getText().toString());
                //n=n+1;
                //displayText.setText(n+"");
            }
        });
        i=0;
        submit2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display2.setText(days[i]);
                i=(i+1)%7;
            }
        });

    }
}

