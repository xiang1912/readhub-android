package com.bihe0832.app.test.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.bihe0832.readhub.app.test.R;

import java.util.ArrayList;
import java.util.List;


public class TestPagerAdapter extends RecyclerView.Adapter<TestPagerAdapter.MyViewHolder> {
    private List<TestItem> mItems = new ArrayList<>();
    private LayoutInflater mInflater;

    public TestPagerAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    public void setDatas(List<TestItem> items) {
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.com_bihe0832_test_item_pager, parent, false);
        final MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TestItem item = mItems.get(position);
        holder.tv_title.setText(item.mTitle);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                mItems.get(position).mListener.onItemClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    protected class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_title;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.test_title);
        }
    }
}
