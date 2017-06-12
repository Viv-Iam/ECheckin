//package com.innovach.echeckin;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.R.attr.name;

//public class NameListViewHolder extends RecyclerView.Adapter<NameListViewHolder.NameViewHolder> {
//    private List<Name> mNames;
//    private Context mContext;
//
//    public NameListViewHolder(Context context, List<Name> names) {
//        mContext = context;
//        mNames = names;
//    }
//
//    @Override
//    public NameListViewHolder.NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_list_item, parent, false);
//        NameViewHolder viewHolder = new NameViewHolder(view);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(NameListViewHolder.NameViewHolder holder, int position) {
//
//        Name name = mNames.get(position);
//        TextView textView = holder.mPersonNameTextView;
//        textView.setText(name.getName());
//        Button button = holder.mCheckinButton;
//        button.setText("Check-in");
//    }
//
//    @Override
//    public int getItemCount() {
//        return mNames.size();
//    }


//    public class NameListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        @Bind(R.id.personNameTextView) TextView mPersonNameTextView;
//        @Bind(R.id.checkinButton) Button mCheckinButton;
//        private List<Name> mNames;
//        View mView;
//        Context mContext;
//
//        public NameListViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//            mView = itemView;
//            mContext = itemView.getContext();
//            itemView.setOnClickListener(this);
//        }
//
//    public void onBindViewHolder(NameListViewHolder holder, int position) {
//
//
//        Name name = mNames;
//        TextView textView = holder.mPersonNameTextView;
//        textView.setText(name.getName());
//        Button button = holder.mCheckinButton;
//        button.setText("Check-in");
//    }
//        @Override
//        public void onClick(View view) {
//            final ArrayList<Name> names = new ArrayList<>();
//            DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_MC2_NAMES);
//            ref.addListenerForSingleValueEvent(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                        names.add(snapshot.getValue(Name.class));
//                    }
//                    int itemPosition = getLayoutPosition();
//                    Intent intent = new Intent(mContext, MC3Activity.class);
//                    intent.putExtra("name", name);
//                    mContext.startActivity(intent);
//                }
//
//                @Override
//                public void onCancelled(DatabaseError databaseError) {
//
//                }
//            });
//        }
//
//
//    }
