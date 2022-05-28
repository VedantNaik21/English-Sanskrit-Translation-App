package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","रक्तवर्णः (Raktavarṇaḥ)"));
        words.add(new Word("Green","दहरितः (Haritaḥ)"));
        words.add(new Word("Brown","कपिशः (Kapiśaḥ)"));
        words.add(new Word("Gray","धूसरः, (Dhūṣaraḥ)"));
        words.add(new Word("Black","कालः (Kālaḥ)"));
        words.add(new Word("White","श्वेतः (Śvetaḥ)"));
        words.add(new Word("Yellow","पीतः (Pītaḥ)"));
        words.add(new Word("Blue","नीलः (Nīlaḥ)"));
        words.add(new Word("Orange","नारङगवर्णः (Nāraṅgavarṇaḥ)"));
        words.add(new Word("Pink","श्वेतरक्तः (Śvetaraktaḥ)"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}