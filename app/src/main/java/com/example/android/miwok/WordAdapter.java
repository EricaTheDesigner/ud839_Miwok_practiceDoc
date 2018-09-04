package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

        //Get the {@Link Word} object located at this position in the list
        Word my_word = (Word) getItem(position);

        //Get the Textview in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        //Get the Miwok translation from the currentWord object and set this text on the Miwok TextView.
        miwokTextView.setText(my_word.getMiwokTranslation());

        //Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        //Get the default translation from the currentWord object and set this text on the default TextView.
        defaultTextView.setText(my_word.getmDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //Set the ImageView to the image resource specified in the current Word
        imageView.setImageResource(currentWord.getImageResourceId());

        //Return the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView
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