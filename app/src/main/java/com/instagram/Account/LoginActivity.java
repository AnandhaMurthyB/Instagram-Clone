package com.instagram.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.instagram.MainActivity;
import com.instagram.R;

public class LoginActivity extends AppCompatActivity {

    private EditText Email_Id, Password;
    private Button Login;
    private TextView Forgot_Password, Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email_Id = findViewById(R.id.email_id);
        Password = findViewById(R.id.password);
        Login = findViewById(R.id.login);
        Forgot_Password = findViewById(R.id.forgot_password);
        Signup = findViewById(R.id.sign_up);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailId = Email_Id.getText().toString();
                String password = Password.getText().toString();

                if (emailId.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Email ID is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Password is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }

                doLogin(emailId, password);
            }
        });

        Forgot_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goForgotPassword();
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSignUp();
            }
        });
    }

    private void goSignUp() {

        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    private void goForgotPassword() {

        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    private void doLogin(String emailId, String password) {

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }
}