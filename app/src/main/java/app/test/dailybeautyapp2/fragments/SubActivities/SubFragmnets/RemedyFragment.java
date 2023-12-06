package app.test.dailybeautyapp2.fragments.SubActivities.SubFragmnets;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.adapter.sub_rv_adapter;
import app.test.dailybeautyapp2.model.subrecyclerViewModel;


public class RemedyFragment extends Fragment {
    RecyclerView recyclerView;
    String dieses_name;



    public RemedyFragment(String dieses_name) {
        this.dieses_name = dieses_name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_remedy, container, false);
        String coconut_oil = getResources().getString(R.string.almond_mask);
        String almond_mask = getResources().getString(R.string.almond_mask);
        String papaya_mask = getResources().getString(R.string.papaya_mask);
        String tomato_mask = getResources().getString(R.string.tomato_mask);

        subrecyclerViewModel[] subrecyclerViewModels = new subrecyclerViewModel[]{
        };

        if (Objects.equals(dieses_name, "Hair Fall")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Frizzy Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Silky,Shiny and Bouncy Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Straight Hai")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Greying Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Dry and Damaged Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Split Ends")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil,"Split Ends"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Split Ends"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Split Ends"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Split Ends"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Split Ends"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Split Ends"),
            };
        } else if (Objects.equals(dieses_name, "Dark Circles")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Puffy Eyes"),
            };
        } else if (Objects.equals(dieses_name, "Puffy Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Puffy Eyes"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Puffy Eyes"),
            };
        } else if (Objects.equals(dieses_name, "Beautiful Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil,"Beautiful Eyes"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask,"Beautiful Eyes"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask,"Beautiful Eyes"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask,"Beautiful Eyes"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil,"Beautiful Eyes"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask,"Beautiful Eyes"),
            };
        } else if (Objects.equals(dieses_name, "Sunken Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Sunken Eyes"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Sunken Eyes"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Sunken Eyes"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Sunken Eyes"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Sunken Eyes"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Sunken Eyes"),
            };
        } else if (Objects.equals(dieses_name, "Thicker and longer eyelashes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Thicker and longer eyelashes"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Thicker and longer eyelashes"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Thicker and longer eyelashes"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Thicker and longer eyelashes"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Thicker and longer eyelashes"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Thicker and longer eyelashes"),
            };
        } else if (Objects.equals(dieses_name, "Face Wrinkles")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Face Wrinkles"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Face Wrinkles"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Face Wrinkles"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Face Wrinkles"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Face Wrinkles"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Face Wrinkles"),
            };
        } else if (Objects.equals(dieses_name, "Acne(Pimples)")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Acne(Pimples)"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Acne(Pimples)"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Acne(Pimples)"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask,"Acne(Pimples)"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Acne(Pimples)"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Acne(Pimples)"),
            };
        } else if (Objects.equals(dieses_name, "Fair Skin")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Black Head")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Black Head"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Black Head"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Black Head"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Black Head"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Black Head"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Black Head"),
            };
        } else if (Objects.equals(dieses_name, "Facial Hair Removal")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Facial Hair Removal"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Facial Hair Removal"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Facial Hair Removal"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Facial Hair Removal"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Facial Hair Removal"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask,"Facial Hair Removal"),
            };
        } else if (Objects.equals(dieses_name, "Teeth Whitening")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Teeth Whitening"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Teeth Whitening"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Teeth Whitening"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Teeth Whitening"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Teeth Whitening"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Teeth Whitening"),
            };
        } else if (Objects.equals(dieses_name, "Dark Lips")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.lemon, "baby_oil", "10 min", coconut_oil,"Dark Lips"),
                    new subrecyclerViewModel(R.drawable.rose, "rgarlic", "1 hr", almond_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.sugar, "olive_oil", "20 min", tomato_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "salt", "1 hr", papaya_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.pomegranate, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.cucumber, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.honey, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.almond, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Dark Lips"),
            };
        } else if (Objects.equals(dieses_name, "Blemeshes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.yougurt, "baby_oil", "10 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.walnut, "rgarlic", "1 hr", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.eggs, "olive_oil", "20 min", tomato_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.avocado, "salt", "1 hr", papaya_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.bell_pepper, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.pumpkin, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.sweet_potatos, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.burd_dock, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.legumes, "tomato", "40 min", almond_mask, "Blemeshes"),
            };
        } else if (Objects.equals(dieses_name, "Waxing at home")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Waxing at home"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Waxing at home"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Waxing at home"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Waxing at home"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Waxing at home"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Waxing at home"),
            };
        } else if (Objects.equals(dieses_name, "Dry And Rough Hands")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.lemon, "baby_oil", "10 min", coconut_oil,"Dark Lips"),
                    new subrecyclerViewModel(R.drawable.rose, "rgarlic", "1 hr", almond_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.sugar, "olive_oil", "20 min", tomato_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "salt", "1 hr", papaya_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.pomegranate, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.cucumber, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.honey, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.almond, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Dark Lips"),
            };
        } else if (Objects.equals(dieses_name, "Nail Growths")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Pinky Shiny Nails")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.lemon, "baby_oil", "10 min", coconut_oil,"Dark Lips"),
                    new subrecyclerViewModel(R.drawable.rose, "rgarlic", "1 hr", almond_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.sugar, "olive_oil", "20 min", tomato_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "salt", "1 hr", papaya_mask, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.pomegranate, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.cucumber, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.honey, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.almond, "coconut_oil", "30 min", coconut_oil, "Dark Lips"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Dark Lips"),
            };
        } else if (Objects.equals(dieses_name, "Dark underarms")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Dark Hands and Feets")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.yougurt, "baby_oil", "10 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.walnut, "rgarlic", "1 hr", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.eggs, "olive_oil", "20 min", tomato_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.avocado, "salt", "1 hr", papaya_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.bell_pepper, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.pumpkin, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.sweet_potatos, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.burd_dock, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.legumes, "tomato", "40 min", almond_mask, "Blemeshes"),
            };
        } else if (Objects.equals(dieses_name, "Glowing Skins")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Unevel Skin")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.yougurt, "baby_oil", "10 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.walnut, "rgarlic", "1 hr", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.eggs, "olive_oil", "20 min", tomato_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.avocado, "salt", "1 hr", papaya_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.bell_pepper, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.pumpkin, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.sweet_potatos, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.burd_dock, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.legumes, "tomato", "40 min", almond_mask, "Blemeshes"),
            };
        } else if (Objects.equals(dieses_name, "Warts")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Stretch Marks")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.baby_oil, "baby_oil", "10 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "rgarlic", "1 hr", almond_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.olive_oil, "olive_oil", "20 min", tomato_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.salt, "salt", "1 hr", papaya_mask, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "coconut_oil", "30 min", coconut_oil, "Fair Skin"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "40 min", almond_mask, "Fair Skin"),
            };
        } else if (Objects.equals(dieses_name, "Body Polish")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.yougurt, "baby_oil", "10 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.walnut, "rgarlic", "1 hr", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.eggs, "olive_oil", "20 min", tomato_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.avocado, "salt", "1 hr", papaya_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.berries, "coconut_oil", "30 min", coconut_oil, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.bell_pepper, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.pumpkin, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.sweet_potatos, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.burd_dock, "tomato", "40 min", almond_mask, "Blemeshes"),
                    new subrecyclerViewModel(R.drawable.legumes, "tomato", "40 min", almond_mask, "Blemeshes"),
            };
        }
        recyclerView = rootView.findViewById(R.id.recyclerViewRemedyFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        sub_rv_adapter adapter = new sub_rv_adapter(subrecyclerViewModels, getContext(), "Remedy");
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}