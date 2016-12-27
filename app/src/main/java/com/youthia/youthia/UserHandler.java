package com.youthia.youthia;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by garia on 26-12-2016.
 */

public class UserHandler extends RecyclerView.ViewHolder{
    public TextView name, occupation, text;

    public UserHandler(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.textView_name_user);
        occupation= (TextView) itemView.findViewById(R.id.textView_occupation_user);
        text = (TextView) itemView.findViewById(R.id.textView_letter_user);
    }
}
