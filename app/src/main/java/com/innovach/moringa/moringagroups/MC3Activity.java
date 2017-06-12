//package com.innovach.echeckin;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//
//public class MC3Activity extends AppCompatActivity {
//    private DatabaseReference mMC2NamesReference;
//        private FirebaseRecyclerAdapter mFirebaseAdapter;
//
//        @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//
//            setContentView(R.layout.activity_mc3);
//            ButterKnife.bind(this);
//
//            mMC2NamesReference = FirebaseDatabase.getInstance().getReference().child(Constants.FIREBASE_CHILD_MC2_NAMES);
//            setUpFirebaseAdapter();
//        }
//
//        private void setUpFirebaseAdapter() {
//            mFirebaseAdapter = new FirebaseRecyclerAdapter<Name, NameListViewHolder>
//                    (Name.class, R.layout.name_list_item, NameListViewHolder.class,
//                            mMC2NamesReference) {
//
//                @Override
//                protected void populateViewHolder(NameListViewHolder viewHolder, Name model, int position) {
//                    viewHolder.onBindViewHolder(NameListViewHolder holder);
//                }
//            };
//            mRecyclerView.setHasFixedSize(true);
//            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//            mRecyclerView.setAdapter(mFirebaseAdapter);
//        }
//
//        @Override
//        protected void onDestroy() {
//            super.onDestroy();
//            mFirebaseAdapter.cleanup();
//        }
//    }