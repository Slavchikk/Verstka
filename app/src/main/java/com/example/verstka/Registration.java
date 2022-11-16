package com.example.verstka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    EditText email, password,name,pasTwo;
    Button Login;
    CheckBox renem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        password = findViewById(R.id.etPassword);
        email = findViewById(R.id.etEmail);
        Login= findViewById(R.id.btnLogin);
        name = findViewById(R.id.etName);
        pasTwo = findViewById(R.id.etPasswordTwo);
        renem = findViewById(R.id.renem);
        TextView reg = findViewById(R.id.txtReg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        Registration.this, Autorization.class));
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                colorBtn();
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                colorBtn();
            }
        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                colorBtn();
            }
        });
        pasTwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                colorBtn();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                colorBtn();
            }
        });
        renem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                colorBtn();
            }
        });

    }

    private  void colorBtn(){
        if(!email.getText().toString().isEmpty()&&!password.getText().toString().isEmpty() &&!name.getText().toString().isEmpty() && !pasTwo.getText().toString().isEmpty()){
            Login.setBackground(getResources().getDrawable(R.drawable.button_b));
            Login.setTextColor(getResources().getColor(R.color.white));

        }
        else{
            Login.setBackground(getResources().getDrawable(R.drawable.button_bledn));
            Login.setTextColor(getResources().getColor(R.color.yellow));
        }
    }
    }
