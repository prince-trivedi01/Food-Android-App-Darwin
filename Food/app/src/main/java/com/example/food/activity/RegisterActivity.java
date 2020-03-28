package com.example.food.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food.R;

public class RegisterActivity extends Activity {

    private EditText edit_name,edit_email,edit_contact,edit_password,edit_conf_pwd;
    private String fullname,email,contact,password,confirm_pwd;
    private Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edit_name = (EditText)findViewById(R.id.fullname);
        edit_email= (EditText)findViewById(R.id.reg_email);
        edit_contact = (EditText)findViewById(R.id.contact);
        edit_password = (EditText)findViewById(R.id.reg_pwd);
        edit_conf_pwd = (EditText)findViewById(R.id.conf_pwd);
        btn_register = (Button)findViewById(R.id.btn_signup);

        fullname = edit_name.getText().toString();
        email= edit_email.getText().toString();
        contact = edit_contact.getText().toString();
        password = edit_password.getText().toString();
        confirm_pwd = edit_conf_pwd.getText().toString();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(RegisterActivity.this,UpdateProfileActivity.class);
               startActivity(intent);
            }
        });
    }

    public void validate()
    {

    }
}
