package com.example.tardis.gestionareabugetului;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button lgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }
    public  void LoginButton() {
        username = (EditText) findViewById(R.id.usern);
        password = (EditText) findViewById(R.id.passw);
        lgn = (Button) findViewById(R.id.button2);
        lgn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user") &&
                                password.getText().toString().equals("pass")) {
                            Toast.makeText(LoginActivity.this, "User and Password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, ModuleSelect.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "User and Password is not correct",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }

                }
        );
    }
}
