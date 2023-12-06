package app.test.dailybeautyapp2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import app.test.dailybeautyapp2.fragments.EyesFragment;
import app.test.dailybeautyapp2.fragments.FaceFragment;
import app.test.dailybeautyapp2.fragments.HairFragment;
import app.test.dailybeautyapp2.fragments.HandsFeetFragment;
import app.test.dailybeautyapp2.fragments.SkinFragment;

public class mainViewPagerAdapter extends FragmentStateAdapter {
    private String[] MaintabTitles;
    public mainViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,String[] MaintabTitles) {
        super(fragmentManager, lifecycle);
        this.MaintabTitles = MaintabTitles;
   }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            //"Eyes", "Hair", "HandsFeet", "Skin", "Face"
            case 0:
                return new HairFragment();
            case 1:
                return new SkinFragment();
            case 2:
                return new FaceFragment();

            case 3:
                return new HandsFeetFragment();

            case 4:
                return new EyesFragment();

            default:
                throw new IllegalStateException("Unexpected position: " + position);
        }
    }

    @Override
    public int getItemCount() {
        return MaintabTitles.length;
    }

    public String getTabTitle(int position) {
        return MaintabTitles[position];
    }
}
