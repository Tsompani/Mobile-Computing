package com.example.tsompani.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FormActivity extends AppCompatActivity {

    private Button buttonValidate;
    private EditText editTextName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews() {
        editTextName = findViewById(R.id.activity_main_textview_name);
        buttonValidate = findViewById(R.id.activity_form_button_name);

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    private void saveData(){
        String name = editTextName.getText().toString();
        if (!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }
        finish();
    }

}
