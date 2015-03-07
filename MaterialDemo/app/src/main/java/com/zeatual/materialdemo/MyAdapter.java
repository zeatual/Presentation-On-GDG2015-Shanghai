package com.zeatual.materialdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zeatual on 15/1/16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Item> items;
    RecyclerView.LayoutManager layoutManager;

    public MyAdapter(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
        items = new ArrayList<>();
        items.add(new Item("小小兔", R.drawable.p1));
        items.add(new Item("水野亚美", R.drawable.p2));
        items.add(new Item("木野真琴", R.drawable.p3));
        items.add(new Item("露娜", R.drawable.p4));
        items.add(new Item("火野丽", R.drawable.p5));
        items.add(new Item("月野兔", R.drawable.p6));
        items.add(new Item("地场卫", R.drawable.p7));
        items.add(new Item("阿尔特米斯", R.drawable.p8));
        items.add(new Item("爱野美奈子", R.drawable.p9));
    }

    public void addItem() {
        if (items.size() > 3) {
            Item item = items.get(2);
            items.remove(2);
            items.add(0, item);
//            items.add(3, new Item("露娜", R.drawable.p4));
            notifyItemMoved(2, 0);
            layoutManager.scrollToPosition(0);
        }
    }

    public void removeItem() {
        if (items.size() > 3) {
            items.remove(3);
            notifyItemRemoved(3);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.name.setText(item.name);
        holder.avatar.setImageResource(item.avatar);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView avatar;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            avatar = (ImageView) itemView.findViewById(R.id.avatar);
        }
    }

}
