package com.example.sunshine.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    private String messageReceiverId, messageReceiverName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageReceiverId = getIntent().getExtras().get("visit_user_id").toString();
        messageReceiverName = getIntent().getExtras().get("visit_user_name").toString();

//        Toast.makeText(this, messageReceiverId, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, messageReceiverName, Toast.LENGTH_SHORT).show();
    }
}
