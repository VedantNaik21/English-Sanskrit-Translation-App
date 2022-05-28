package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","तात:"));
        words.add(new Word("Mother","जननी"));
        words.add(new Word("Son","पुत्रः"));
        words.add(new Word("Daughter","पुत्री;"));
        words.add(new Word("Elder Brother","अग्रजः"));
        words.add(new Word("Elder Sister","अग्रजा"));
        words.add(new Word("Younger Brother","अनुजः"));
        words.add(new Word("Younger Sister","अवरजा"));
        words.add(new Word("Grandfather","पितामहः"));
        words.add(new Word("Grandmother","पितामही"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}