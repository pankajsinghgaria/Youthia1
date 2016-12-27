package com.youthia.youthia.ActivityClass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.youthia.youthia.R;
import com.youthia.youthia.User;
import com.youthia.youthia.UserHandler;

public class AdminUserList extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mDatabaseReference = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_user_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        FirebaseRecyclerAdapter<User, UserHandler> adapter = new FirebaseRecyclerAdapter<User, UserHandler>(
                User.class,
                R.layout.user_list_row_layout,
                UserHandler.class,
                mDatabaseReference.child("Users").getRef()
        ) {
            @Override
            protected void populateViewHolder(UserHandler viewHolder, User model, int position) {
               viewHolder.name.setText(model.getName());
                viewHolder.occupation.setText(model.getOccupattion());
                viewHolder.text.setText(String.valueOf(model                                                                                                                             .getName().charAt(0)));
                }
        };
        mRecyclerView.setAdapter(adapter);
    }

}
