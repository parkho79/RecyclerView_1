package com.parkho.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PhRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;

    public PhRecyclerViewHolder(View a_itemView) {
        super(a_itemView);

        tvName = a_itemView.findViewById(R.id.tv_name);
    }

}