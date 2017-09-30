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
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Add words here using ArrayList
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        //Find the root view of the whole layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Create a variable to keep track of the current index position
        //int index = 0;
        // while (index < words.size()){
        //   TextView wordView = new TextView(this);
        //    wordView.setText(words.get(index));
        //   rootView.addView(wordView);
        //   index = index + 1;
        //}


        for(int index = 0; index < words.size(); index++){
            //Create a new TextView
            TextView wordView = new TextView(this);

            //Set the text to be word at the current index
            wordView.setText(words.get(index));

            //Add this TextView as another child to the root view of this layout --
            rootView.addView(wordView);

        }
    }
}
