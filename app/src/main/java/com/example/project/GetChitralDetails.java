package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GetChitralDetails extends AppCompatActivity {

    EditText chitral_name, chitral_email, chitral_phone;
    Button chitral_submit;
    chitral_sqldb mychitral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_chitral_details);
        chitral_name = findViewById(R.id.chitral_name);
        chitral_email = findViewById(R.id.chitral_email);
        chitral_phone = findViewById(R.id.chitral_phone);
        chitral_submit = findViewById(R.id.chitral_submit);

        mychitral = new chitral_sqldb(this);

        chitral_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chitral_name.length()==0){
                    chitral_name.setError("Enter name");
                }
                else if(chitral_email.length()==0){
                    chitral_email.setError("Enter email");
                }
                else if(chitral_phone.length()==0){
                    chitral_phone.setError("Enter phone number");
                }
                else {
                    String ch_name = chitral_name.getText().toString();
                    String ch_email = chitral_email.getText().toString();
                    String ch_phone = chitral_phone.getText().toString();
                    boolean checksave = mychitral.insert_chi_data( ch_name , ch_email, ch_phone);
                    if ( checksave == true ){
                        Toast.makeText(GetChitralDetails.this, "Data saved successfully ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(GetChitralDetails.this, "Data not saved ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}