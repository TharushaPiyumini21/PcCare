package com.example.student.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Member;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {

    private static final Currency Firebasedatabase = ;
    TextView textView;
    ImageView imageView;
    EditText name,phone,description;
    Button button2;
    DatabaseReference reff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        description = (EditText) findViewById(R.id.description);
        button2 = (Button) findViewById(R.id.button2);
        Member = new Member();
        reff = Firebasedatabase.getInstance().getReference().child ("member");



    }
}
