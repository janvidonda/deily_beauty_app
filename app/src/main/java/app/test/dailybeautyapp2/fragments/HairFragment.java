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

public class HairFragment extends Fragment {
RecyclerView recyclerView;


    public HairFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_hair, container, false);
        MainrecyclerViewModel[] mainrecyclerViewModels = new MainrecyclerViewModel[]
                {
                        new MainrecyclerViewModel("Silky,Shiny and Bouncy Hair", R.drawable.hsilkyhair),
                        new MainrecyclerViewModel("Hair Fall", R.drawable.hair_fall),

                        new MainrecyclerViewModel("Greying Hair", R.drawable.hgraying_hair),
                        new MainrecyclerViewModel("Frizzy Hair", R.drawable.hfreezy_hair),
                        new MainrecyclerViewModel("DandDruff", R.drawable.hdanddruff),
                        new MainrecyclerViewModel("Split Ends", R.drawable.hsplit_ends),
                        new MainrecyclerViewModel("Straight Hair", R.drawable.hstraight_hair),

                        new MainrecyclerViewModel("Dry and Damaged Hair", R.drawable.hdry_and_damaged_hair),

                };
        recyclerView = rootView.findViewById(R.id.recyclerViewHairFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        main_rv_adapter adapter = new main_rv_adapter(mainrecyclerViewModels, getContext(),"Hair");
        recyclerView.setAdapter(adapter);
        return  rootView;

    }

}