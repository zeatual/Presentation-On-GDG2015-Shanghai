package com.zeatual.materialdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by zeatual on 15/1/16.
 */
public class WidgetTintingFragment extends Fragment {

    public static WidgetTintingFragment getInstance() {
        return new WidgetTintingFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_widget_tinting, container, false);
        setHasOptionsMenu(false);
        EditText et = (EditText) view.findViewById(R.id.edit_text);
        Spannable spannable = new SpannableStringBuilder("@hello", 0, 5);
        et.setText(spannable);

        return view;
    }

}
