package app.test.dailybeautyapp2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.adapter.main_rv_adapter;
import app.test.dailybeautyapp2.model.MainrecyclerViewModel;


public class SkinFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_skin, container, false);
        MainrecyclerViewModel[] mainrecyclerViewModels = new MainrecyclerViewModel[]
                {
                        new MainrecyclerViewModel("Body Polish", R.drawable.body_polish),
                        new MainrecyclerViewModel("Glowing Skin", R.drawable.glowing_skin),                        new MainrecyclerViewModel("Body Scrubs", R.drawable.body_scrub),
                        new MainrecyclerViewModel("Body Scrubs", R.drawable.body_scrub),
                        new MainrecyclerViewModel("Unevel Skin", R.drawable.unevel_skin),
                        new MainrecyclerViewModel("Warts", R.drawable.warns),
                        new MainrecyclerViewModel("Stretch Marks", R.drawable.stretch_marks),
                };
        recyclerView = rootView.findViewById(R.id.recyclerViewSkinFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        main_rv_adapter adapter = new main_rv_adapter(mainrecyclerViewModels, getContext(), "Skin");
        recyclerView.setAdapter(adapter);
        return rootView;

    }
}