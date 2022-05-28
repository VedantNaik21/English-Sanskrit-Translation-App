package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?","भवतः नाम किम्"));
        words.add(new Word("Who is writing?","कः लिखति"));
        words.add(new Word("My Name is...","मम नाम...."));
        words.add(new Word("How are you feeling?","भवतः नाम किम्"));
        words.add(new Word("I'm feeling good","भवतः नाम किम्"));
        words.add(new Word("Come here","भवतः नाम किम्"));
        words.add(new Word("Let's go","भवतः नाम किम्"));
        words.add(new Word("I am Hungry","भवतः नाम किम्"));
        words.add(new Word("I need water","भवतः नाम किम्"));
        words.add(new Word("","भवतः नाम किम्"));
        words.add(new Word("I am writing","अहं लिखामि।"));
        words.add(new Word("What is your name?","भवतः नाम किम्"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}