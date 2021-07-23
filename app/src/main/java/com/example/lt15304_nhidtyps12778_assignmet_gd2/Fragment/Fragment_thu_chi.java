package com.example.lt15304_nhidtyps12778_assignmet_gd2.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.lt15304_nhidtyps12778_assignmet_gd2.Adapter.TabAdapetr;
import com.example.lt15304_nhidtyps12778_assignmet_gd2.R;
import com.example.lt15304_nhidtyps12778_assignmet_gd2.TabFragmnet.Tab_Khoanthu;
import com.example.lt15304_nhidtyps12778_assignmet_gd2.TabFragmnet.Tab_Khoanchi;
import com.google.android.material.tabs.TabLayout;

public class Fragment_thu_chi extends Fragment {
    private TabAdapetr adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thu_chi, container, false);

        viewPager =  view.findViewById(R.id.viewPager);
        tabLayout =  view.findViewById(R.id.tabLayout);

        adapter = new TabAdapetr(getActivity().getSupportFragmentManager());
        adapter.addFragment(new Tab_Khoanthu(), "Khoản thu");
        adapter.addFragment(new Tab_Khoanchi(), "Khoản chi");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
