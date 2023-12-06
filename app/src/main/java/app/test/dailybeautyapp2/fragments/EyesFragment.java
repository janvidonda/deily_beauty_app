package app.test.dailybeautyapp2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.adapter.main_rv_adapter;
import app.test.dailybeautyapp2.model.MainrecyclerViewModel;


public class EyesFragment extends Fragment {
    RecyclerView recyclerView;


    public EyesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eyes, container, false);
        MainrecyclerViewModel[] mainrecyclerViewModels = new MainrecyclerViewModel[]
                {
                        new MainrecyclerViewModel("Sunken Eyes", R.drawable.sunken_eyes),
                        new MainrecyclerViewModel("Better Eyebrows", R.drawable.eyebrows),
                        new MainrecyclerViewModel("Thicker and longer eyelashes", R.drawable.eyeleshes),
                        new MainrecyclerViewModel("Dark Circles", R.drawable.dark_circules),
                        new MainrecyclerViewModel("Puffy Eyes", R.drawable.epuffy),
                        new MainrecyclerViewModel("Beautiful Eyes", R.drawable.beauticul),

                };
        recyclerView = rootView.findViewById(R.id.recyclerViewEyesFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        main_rv_adapter adapter = new main_rv_adapter(mainrecyclerViewModels, getContext(),"Eyes");
        recyclerView.setAdapter(adapter);

        return rootView;

    }
}