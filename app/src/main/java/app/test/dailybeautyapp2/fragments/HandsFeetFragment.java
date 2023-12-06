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

public class HandsFeetFragment extends Fragment {
RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_hands_feet, container, false);
        MainrecyclerViewModel[] mainrecyclerViewModels = new MainrecyclerViewModel[]
                {                        new MainrecyclerViewModel("Dark underarms", R.drawable.underarms),

                        new MainrecyclerViewModel("Dark Hands and Feets", R.drawable.dark_hands_feet),
                        new MainrecyclerViewModel("Pinky Shiny Nails", R.drawable.beauticul_nails),

                        new MainrecyclerViewModel("Waxing at home", R.drawable.wax),
                        new MainrecyclerViewModel("Nail Growth", R.drawable.nails),

                        new MainrecyclerViewModel("Dry And Rough Hands", R.drawable.dry_hands),

                };
        recyclerView = rootView.findViewById(R.id.recyclerViewHandsFeetFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        main_rv_adapter adapter = new main_rv_adapter(mainrecyclerViewModels, getContext(),"HandsFeet");
        recyclerView.setAdapter(adapter);
        return  rootView;
    }
}