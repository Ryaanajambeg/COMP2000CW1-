package com.example.comp2000cw1ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
            private Button Registerbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registerbutton = (Button) findViewById(R.id.Registerbutton);
        Registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterAccountActivity();
            }
        });
    }
    public void openRegisterAccountActivity(){
        Intent intent = new Intent(this, RegisterAccountActivity.class);
        startActivity(intent);

    }

}