package com.instagram.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.instagram.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    
    private EditText Email_Id;
    private Button Send_Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        
        Email_Id = findViewById(R.id.email_id);
        Send_Link = findViewById(R.id.send_link);
        
        Send_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                String emailId = Email_Id.getText().toString();
                
                if (emailId.isEmpty()) {
                    Toast.makeText(ForgotPasswordActivity.this, "Email ID is empty.", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                sendLink(emailId);
            }
        });
    }

    private void sendLink(String emailId) {
    }
}