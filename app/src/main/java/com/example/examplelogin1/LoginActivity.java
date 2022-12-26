package com.example.examplelogin1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.text.BreakIterator;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button loginButton;

    public final static String USERNAME_KEY = "com.example.exampleLogin1.username_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void sendData(View view){
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.btnLogin);

        String username = etUsername.getText().toString();

        loginButton.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                    if (etUsername.getText().toString().equals("username") && etPassword.getText().toString().equals("1234")){
                        Toast.makeText(LoginActivity.this, "Login Successful!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, SecondActivity.class);

                        //Intent intent = new Intent(LoginActivity.this, SecondActivity.class);
                        intent.putExtra(USERNAME_KEY, username);

                        startActivity(intent);

                    }else{
                        showAlertDialogButtonClicked();
                    }
        }
        });
    }
    public void showAlertDialogButtonClicked(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("Username and Password is wrong. Please try again?");
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
