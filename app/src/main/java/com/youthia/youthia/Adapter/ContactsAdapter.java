package com.youthia.youthia.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.youthia.youthia.Contact;
import com.youthia.youthia.R;

import java.util.List;

/**
 * Created by garia on 21-11-2016.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder>{

    private List<Contact> contactList;

    public ContactsAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list_row_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contact contact = contactList.get(position);
        holder.name.setText(contact.getName());
        String alpha = String.valueOf(contact.getName().charAt(0));
        holder.letter.setText(alpha);
        holder.occupation.setText(contact.getOccupation());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView letter, name, occupation;

        public MyViewHolder(View itemView) {
            super(itemView);
            letter = (TextView) itemView.findViewById(R.id.textView_letter_user);
            name = (TextView) itemView.findViewById(R.id.textView_name_user);
            occupation = (TextView) itemView.findViewById(R.id.textView_occupation);
        }
    }
}
