package com.example.detaillistfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    TextView tvfname, tvfdob, tvfadd, tvfemail;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment,container,false);

        tvfname = (TextView)view.findViewById(R.id.tv_fname);
        tvfdob = (TextView)view.findViewById(R.id.tv_fyear);
        tvfadd = (TextView)view.findViewById(R.id.tv_faddress);
        tvfemail = (TextView)view.findViewById(R.id.tv_femail);

        return view;
    }
}
