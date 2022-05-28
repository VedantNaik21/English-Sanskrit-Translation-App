package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","एकम् (ekam)"));
        words.add(new Word("Two","द्वे (dve)"));
        words.add(new Word("Three","त्रीणि (treeni)"));
        words.add(new Word("Four","चत्वारि (chatvaari)"));
        words.add(new Word("Five","पञ्च (pancha)"));
        words.add(new Word("Six","षट् (shat)"));
        words.add(new Word("Seven","सप्त (sapta)"));
        words.add(new Word("Eight","अष्ट (ashta)"));
        words.add(new Word("Nine","नव (nava)"));
        words.add(new Word("Ten","दश (dasha)"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}