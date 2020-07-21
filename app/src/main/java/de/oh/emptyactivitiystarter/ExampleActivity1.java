package de.oh.emptyactivitiystarter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ExampleActivity1 extends AppCompatActivity {

    private Button buttonClickMe;
    private Button buttonBack;
    private TextView editTextTextPersonName;
    private TextView editTextTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);

        // Find TextView by its ID
        this.editTextTextPersonName  = (TextView)this.findViewById(R.id.editTextTextPersonName);

        // Find TextView by its ID
        this.editTextTextPassword = (TextView)this.findViewById(R.id.editTextTextPassword);

        this.buttonClickMe = (Button)this.findViewById(R.id.button_clickMe);

        this.buttonBack = (Button)this.findViewById(R.id.button_back);

        // Get the intent sent from MainActivity.
        Intent intent = getIntent();

        // Parameter in Intent, sent from MainActivity
        String value1 = intent.getStringExtra("text1");

        // Parameter in Intent, sent from MainActivity
        String value2 = intent.getStringExtra("text2");

       // this.editTextTextPersonName.setText(value1);
      //  this.editTextTextPassword.setText(value2);

        // When user click "Click me" button.
        this.buttonClickMe.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
              //  editTextTextPassword.setText("You click button");

                ExampleActivity1.this.finish();
            }
        });


        // When user click "Back" button.
        this.buttonBack.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Back to previous Activity.
                ExampleActivity1.this.finish();
            }
        });

    }
}