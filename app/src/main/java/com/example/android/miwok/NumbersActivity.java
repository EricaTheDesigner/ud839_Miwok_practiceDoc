/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
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
//        //Create an array of words
//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
////print message to see if the values are what you think they are
//        Log.v("NumbersActivity","Word at index 0: " + words[0]);
//        Log.v("NumbersActivity","Word at index 1: " + words[1]);
        //TODO Create an arrayList of words
        ArrayList<String> words = new ArrayList<String>();
        words.add(0, "one");
        words.add(1, "two");
        words.add(2, "three");
        words.add(3, "four");
        words.add(4, "five");
        words.add(5, "six");
        words.add(6, "seven");
        words.add(7, "eight");
        words.add(8, "nine");
        words.add(9, "ten");
//        //While statement
//        int i =0;
//        while (i < words.size()) {
//            LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//            i++;
//        }

        //For statement
//        for (int i = 0; i < words.size(); i++){
//            LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }

//        //print message to test values
//        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));

//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(1));
//        rootView.addView(wordView2);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
