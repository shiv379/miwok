package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Toby on 10/06/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mActivityColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int activityColor){
        super(context, 0, words);
        mActivityColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word word = getItem(position);

        TextView playIcon = (TextView) listItemView.findViewById(R.id.play_icon);
        LinearLayout textLinearLayout = (LinearLayout) listItemView.findViewById(R.id.textLinearLayout);
        int color = ContextCompat.getColor(getContext(), mActivityColor);
        textLinearLayout.setBackgroundColor(color);
        playIcon.setBackgroundColor(color);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(word.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());

        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(word.hasImage()) {
            wordImageView.setImageResource(word.getImageResourceId());
            wordImageView.setVisibility(View.VISIBLE);
        } else {
            wordImageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
