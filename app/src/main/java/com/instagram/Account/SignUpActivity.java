package com.instagram.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.instagram.R;

public class SignUpActivity extends AppCompatActivity {

    private EditText Email_Id, Password, Confirm_Password;
    private TextView Forgot_Password, Login;
    private Button Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Email_Id = findViewById(R.id.email_id);
        Password = findViewById(R.id.password);
        Confirm_Password = findViewById(R.id.confirm_password);
        Forgot_Password = findViewById(R.id.forgot_password);
        Login = findViewById(R.id.login);
        Signup = findViewById(R.id.sign_up);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailId = Email_Id.getText().toString();
                String password = Password.getText().toString();
                String confirmPassword = Confirm_Password.getText().toString();

                if (emailId.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Email ID is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Password is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (confirmPassword.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Confirm Password is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(SignUpActivity.this, "Passwords doesn't match.", Toast.LENGTH_SHORT).show();
                    return;
                }

                doSignUp(emailId, password);
            }
        });

        Forgot_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goForgotPassword();
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLogin();
            }
        });
    }

    private void goLogin() {

        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void goForgotPassword() {

        Intent intent = new Intent(SignUpActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    private void doSignUp(String emailId, String password) {

        goLogin();

    }
}