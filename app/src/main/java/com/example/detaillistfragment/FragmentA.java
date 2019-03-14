package com.example.detaillistfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentA extends ListFragment {
    CusArrayAdapter arrAdap;
    ArrayList<Human> arr = null;
    DetailFragment detailFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        arr = new ArrayList<Human>();
        arr.add(new Human("Jack", "1995", "1st Wall.st", "abc@gmail.com"));
        arr.add(new Human("Jenny", "1995", "1st Wall.st", "abc@gmail.com"));
        arr.add(new Human("Jill", "1996", "1st Wall.st", "abc@gmail.com"));
        arrAdap = new CusArrayAdapter(getActivity(),R.layout.custom_layout,arr);
        setListAdapter(arrAdap);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Human h = arr.get(position);
        detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detai_frag);
        if (detailFragment!=null&&detailFragment.isInLayout()){
            detailFragment.tvfname.setText(h.getName());
            detailFragment.tvfdob.setText(h.getDob());
            detailFragment.tvfadd.setText(h.getAddress());
            detailFragment.tvfemail.setText(h.getEmail());
        }else {
            Intent intent = new Intent(getActivity(),DetailActivity.class);
            intent.putExtra("guidulieuquaText",h);
            startActivity(intent);
        }
    }
}
