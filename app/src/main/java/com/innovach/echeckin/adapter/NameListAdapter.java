package com.innovach.echeckin.adapter;


import android.support.v7.widget.RecyclerView;

import butterknife.ButterKnife;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {
    private List<Name> mNames;
    private Context mContext;

    public NameListAdapter(Context context, List<Name> names) {
        mContext = context;
        mNames = names;
    }
    public class NameViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.personNameTextView)  TextView mPersonNameTextView;
        @Bind(R.id.checkinButton) Button mCheckinButton;
        private Context mContext;

        public NameViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
    }
}
