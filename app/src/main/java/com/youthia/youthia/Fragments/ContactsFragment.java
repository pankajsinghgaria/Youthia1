package com.youthia.youthia.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.youthia.youthia.Adapter.ContactsAdapter;
import com.youthia.youthia.Contact;
import com.youthia.youthia.DividerItemDecoration;
import com.youthia.youthia.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by garia on 21-11-2016.
 */

public class ContactsFragment extends Fragment {
    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ContactsAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.contacts_fragment_layout, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        mAdapter = new ContactsAdapter(contactList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(v.getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }

        });
        prepareContactData();

        return v;
    }

    private void prepareContactData(){
        for(int i=0; i<20; i++) {
            Contact contact = new Contact("PANKAJ", "software engineer", "9720677966", "8569856");
            contactList.add(contact);
            contact = new Contact("KARAN", "bankManager", "9599326668", "343434343");
            contactList.add(contact);
        }
    }
}
