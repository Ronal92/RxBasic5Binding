package com.jinwoo.android.rxbasic5binding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;

public class MainActivity extends AppCompatActivity {

    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (EditText)findViewById(R.id.search);

        RxTextView.textChangeEvents((EditText)findViewById(R.id.search))
                .subscribe(
                        word -> Log.e("search word", word.text().toString())
                );

    }
}
