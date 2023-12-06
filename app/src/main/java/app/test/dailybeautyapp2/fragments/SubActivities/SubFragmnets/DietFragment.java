package app.test.dailybeautyapp2.fragments.SubActivities.SubFragmnets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.adapter.sub_rv_adapter;
import app.test.dailybeautyapp2.model.MainrecyclerViewModel;
import app.test.dailybeautyapp2.model.subrecyclerViewModel;


public class DietFragment extends Fragment {
    RecyclerView recyclerView;
    String dieses_name;

    public DietFragment(String dieses_name) {
        this.dieses_name = dieses_name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)

    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_diet, container, false);
        String coconut_oil = getResources().getString(R.string.almond_mask);
        String almond_mask = getResources().getString(R.string.almond_mask);
        String papaya_mask = getResources().getString(R.string.papaya_mask);
        String tomato_mask = getResources().getString(R.string.tomato_mask);
        subrecyclerViewModel[] subrecyclerViewModels = new subrecyclerViewModel[]{

        };
        if (Objects.equals(dieses_name, "Hair Fall")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Frizzy Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Silky,Shiny and Bouncy Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Straight Hai")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Greying Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Dry and Damaged Hair")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        }
        else if (Objects.equals(dieses_name, "Split Ends")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Dark Circles")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Puffy Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Beautiful Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Sunken Eyes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Thicker and longer eyelashes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        } else if (Objects.equals(dieses_name, "Face Wrinkles")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Acne(Pimples)")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Fair Skin")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Black Head")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Facial Hair Removal")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Teeth Whitening")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Dark Lips")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Blemeshes")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.lemon, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sweet_potatos, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.multani_mitti, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.orange_peel, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana_peel, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.cucumber, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.strawberry, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Waxing at home")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        } else if (Objects.equals(dieses_name, "Dry And Rough Hands")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Nail Growths")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Pinky Shiny Nails")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        } else if (Objects.equals(dieses_name, "Dark underarms")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Dark Hands and Feets")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.acne, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.day_to_day_skin_care, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.sun, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.ice_cubes, "white_vinegar", "30 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", papaya_mask, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Glowing Skins")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Unevel Skin")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        } else if (Objects.equals(dieses_name, "Warts")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),
            };
        } else if (Objects.equals(dieses_name, "Stretch Marks")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")
            };
        } else if (Objects.equals(dieses_name, "Body Scrubs")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.honey, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.green_tea, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.coconut_oil, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.walnut, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.yougurt, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.lemon, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.water_melonjpeg, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.aloe_vera, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.beet_roots, "garlic", "10 min", coconut_oil, "Hair Fall"),

            };
        } else if (Objects.equals(dieses_name, "Body Polish")) {
            subrecyclerViewModels = new subrecyclerViewModel[]{
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.tomato, "tomato", "05 min", tomato_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.almond, "almond", "1 hr", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.banana, "banana", "15 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.white_vinegar, "white_vinegar", "30 min", papaya_mask, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.rgarlic, "garlic", "10 min", coconut_oil, "Hair Fall"),
                    new subrecyclerViewModel(R.drawable.papaya, "papaya", "20 min", almond_mask, "Hair Fall")

            };
        }
        recyclerView = rootView.findViewById(R.id.recyclerViewDietFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        sub_rv_adapter adapter = new sub_rv_adapter(subrecyclerViewModels, getContext(), "Diet");
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}