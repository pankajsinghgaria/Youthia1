package com.youthia.youthia.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.youthia.youthia.R;
import com.youthia.youthia.User;
import com.youthia.youthia.UserHandler;

/**
 * Created by garia on 21-11-2016.
 */

public class ContactsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mDatabaseReference = database.getReference();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.contacts_fragment_layout, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        FirebaseRecyclerAdapter<User, UserHandler> adapter = new FirebaseRecyclerAdapter<User, UserHandler>(
                User.class,
                R.layout.user_list_row_layout,
                UserHandler.class,
                mDatabaseReference.child("Users").getRef()
        ) {
            @Override
            protected void populateViewHolder(UserHandler viewHolder, User model, int position) {
                viewHolder.name.setText(model.getName());
                viewHolder.occupation.setText(model.getOccupation());
                viewHolder.text.setText(String.valueOf(model                                                                                                                             .getName().charAt(0)));
            }
        };
        mRecyclerView.setAdapter(adapter);

        return v;
    }

}
