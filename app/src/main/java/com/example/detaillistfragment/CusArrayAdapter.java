package com.example.detaillistfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CusArrayAdapter extends BaseAdapter {
    Context myConText;//activity chua listview
    int myLayout;// dong chua thong tin cua Item
    List<Human> mylst;// danh sach

    public CusArrayAdapter(Context myConText, int myLayout, List<Human> mylst) {
        this.myConText = myConText;
        this.myLayout = myLayout;
        this.mylst = mylst;
    }
    private class ViewHolder {
        private TextView tv_ten;
        private ImageView img;
    }

    @Override
    public int getCount() {
        return mylst.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) myConText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(myLayout, null);
            holder = new ViewHolder();
            //Ánh xạ
            holder.tv_ten = view.findViewById(R.id.cus_tv);
            holder.img = view.findViewById(R.id.cus_img);
            view.setTag(holder);
        } else
            holder = (ViewHolder) view.getTag();
        //Gán giá trị từ List SV
        holder.tv_ten.setText(mylst.get(i).getName());
        holder.img.setImageResource(R.drawable.iconfinder_4_3561839);
        return view;

    }
}
