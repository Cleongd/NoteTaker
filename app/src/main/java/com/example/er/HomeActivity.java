package com.example.er;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnAddNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findview();
        setListenrs();
    }

    private void findview(){
        btnAddNote = findViewById(R.id.btnAddnote);
    }

    private void setListenrs(){
        btnAddNote.setOnClickListener(new View.OnClickListener()){
            @Override
                public void onclick(View v){
                    Intent i = new Intent(HomeActivity.this, AddNoteActivity.class);
            }
        }
    }
}
