package com.example.tardis.gestionareabugetului;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class CheltuieliActivity extends AppCompatActivity {
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    Switch simpleSwitch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheltuieli);
        sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        String value1 = null;
        String value2 = null;
        String value3 = null;
        String value4 = null;
        String value5 = null;
        String value6 = null;
        editor.putString("alimentare", value1);
        editor.putString("casaingrijire", value2);
        editor.putString("haine", value3);
        editor.putString("facturi", value4);
        editor.putString("timpliber", value5);
        editor.putString("economii", value6);
        editor.commit();

        simpleSwitch1 = (Switch) findViewById(R.id.switch2);
        simpleSwitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (simpleSwitch1.isChecked()) {
                    Intent intent = new Intent(CheltuieliActivity.this, ListActivity.class);
                    startActivity(intent);
                }
            }
        });


        EditText editText = (EditText) findViewById(R.id.editText);
        value1 = editText.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        value2 = editText.getText().toString();
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        value3 = editText.getText().toString();
        EditText editText6 = (EditText) findViewById(R.id.editText6);
        value4 = editText.getText().toString();
        EditText editText7 = (EditText) findViewById(R.id.editText7);
        value5 = editText.getText().toString();
        EditText editText8 = (EditText) findViewById(R.id.editText8);
        value6 = editText.getText().toString();

    }
    }
