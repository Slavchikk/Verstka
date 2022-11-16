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

public class Autorization extends AppCompatActivity  {
    EditText email, password;
    Button Login;
    CheckBox renem;
    Button btn;
    Boolean checks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization);
        renem = findViewById(R.id.renem);
        password = findViewById(R.id.etPassword);
        email = findViewById(R.id.etEmail);
        Login= findViewById(R.id.btnLogin);

        TextView reg = findViewById(R.id.txtReg);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        Autorization.this, Finially.class));
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        Autorization.this, Registration.class));
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


    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.renem:
                if (checked) {
                    renem.setButtonDrawable(getDrawable(R.drawable.back_bledn));
                    renem.setBackground(getDrawable(R.drawable.checked));
                }
            else
                { renem.setButtonDrawable(getDrawable(R.drawable.back_bledn));
                    renem.setBackground(getDrawable(R.drawable.unchecked));}
                break;

        }
    }


    private  void colorBtn(){
        if(!email.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()){
            Login.setBackground(getResources().getDrawable(R.drawable.button_b));
            Login.setTextColor(getResources().getColor(R.color.white));
            checks = true;
        }
        else{
            Login.setBackground(getResources().getDrawable(R.drawable.button_bledn));
            Login.setTextColor(getResources().getColor(R.color.yellow));
            checks = false;
        }
    }



}
