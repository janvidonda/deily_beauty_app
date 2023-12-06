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


public class FaceFragment extends Fragment {
    RecyclerView recyclerView;


    public FaceFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_face, container, false);
        MainrecyclerViewModel[] mainrecyclerViewModels = new MainrecyclerViewModel[]
                {
                        new MainrecyclerViewModel("Face Wrinkles", R.drawable.face),
                        new MainrecyclerViewModel("Acne(Pimples)", R.drawable.acne),
                        new MainrecyclerViewModel("Fair Skin", R.drawable.fair_skin),
                        new MainrecyclerViewModel("Black Heads", R.drawable.black_heads),
                        new MainrecyclerViewModel("Facial Hair Removal", R.drawable.hair_remove),
                        new MainrecyclerViewModel("Teeth Whitening", R.drawable.white_teeth),
                        new MainrecyclerViewModel("Dark Lips", R.drawable.dark_lips),
                        new MainrecyclerViewModel("Blemeshes", R.drawable.blemishes),
                };
        recyclerView = rootView.findViewById(R.id.recyclerViewFaceFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        main_rv_adapter adapter = new main_rv_adapter(mainrecyclerViewModels, getContext(),"Face");
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}