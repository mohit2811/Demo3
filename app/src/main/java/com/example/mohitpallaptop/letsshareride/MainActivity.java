package com.example.mohitpallaptop.letsshareride;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user_edit);
        password = (EditText) findViewById(R.id.pass_edit);
    }

    public void done(View view) {
        if (username.getText().toString().equals("mohit") && password.getText().toString().equals("123456")) {

            pop_up_login pop = new pop_up_login(MainActivity.this);
            pop.show();

        } else {
            pop_up_error pope = new pop_up_error(MainActivity.this);
            pope.show();
        }


    }

}

