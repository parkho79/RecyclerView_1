package com.parkho.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PhRecyclerViewAdapter extends RecyclerView.Adapter<PhRecyclerViewHolder> {

    private ArrayList<String> mNameList;

    public PhRecyclerViewAdapter(ArrayList<String> a_list) {
        mNameList = a_list;
    }

    @Override
    public PhRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup a_viewGroup, int a_position) {
        View view = LayoutInflater.from(a_viewGroup.getContext()).inflate(R.layout.content_recycler_item, a_viewGroup, false);
        return new PhRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhRecyclerViewHolder a_viewHolder, int a_position) {
        String strName = mNameList.get(a_position);
        a_viewHolder.tvName.setText(strName);

    }

    @Override
    public int getItemCount() {
        return mNameList.size();
    }
}