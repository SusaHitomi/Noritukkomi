package com.kayosystem.honki.chapter02.noritukkomi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SingleViewHolder extends RecyclerView.ViewHolder {
    private final TextView mTextView;
    private Context mContext;
    public SingleViewHolder(View v,Context context) {
        super(v);

        mContext = context;
        mTextView = (TextView) v.findViewById(R.id.item_name);
    }

}
