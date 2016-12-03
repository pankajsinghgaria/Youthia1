package com.youthia.youthia.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youthia.youthia.R;


public class ChatFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Checkout testing
        View view;
        view= inflater.inflate(R.layout.chats_fragment_layout,container,false);
        return view;
    }
}
