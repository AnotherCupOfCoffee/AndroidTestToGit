package de.oh.emptyactivitiystarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExampleActivity4 extends AppCompatActivity {

    private Button button_save;
    private Button button_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);

        this.button_save = (Button) this.findViewById(R.id.button_save);

        this.button_cancel = (Button) this.findViewById(R.id.button_cancel);

        // When user click "Click me" button.
        this.button_save.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                //  editTextTextPassword.setText("You click button");

                ExampleActivity4.this.finish();
            }
        });


        // When user click "Back" button.
        this.button_cancel.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Back to previous Activity.
                ExampleActivity4.this.finish();

            }
        });
    }
}