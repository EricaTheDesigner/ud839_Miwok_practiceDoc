package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> Words) {
        super(context, 0, Words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word my_word = (Word) getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(my_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(my_word.getmDefaultTranslation());

        return listItemView;
    }
}

////Looping over 2D Arrays
//public static double englishAverage (int [][] grades, int student) {
//    int subjects = grades.length;
//    int total = 0;
//    for (int i = 0; i < subjects; i++) {
//        total += grades[i][student];
//    }
//    double average = total / (double)subjects;
//    return average;
//    }
//}
//
////Nested Loops
//
//for(int i=0; i<3; i++){
//    for(int j=0; j<3; j++){
//        System.out.println("Hi!");
//        }
//        }