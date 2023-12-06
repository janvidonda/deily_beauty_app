package app.test.dailybeautyapp2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import app.test.dailybeautyapp2.fragments.SubActivities.SubFragmnets.DietFragment;
import app.test.dailybeautyapp2.fragments.SubActivities.SubFragmnets.ExersiseFragment;
import app.test.dailybeautyapp2.fragments.SubActivities.SubFragmnets.RemedyFragment;

public class subViewPagerAdapter extends FragmentStateAdapter {
    private String[] subTabTitlesFragment;
    String rv_dieses_name_appbar_name;

    String[] subtitle;

    public subViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, String[] subTabTitlesFragment, String rv_dieses_name_appbar_name, String[] subtitle) {
        super(fragmentManager, lifecycle);
        this.subTabTitlesFragment = subTabTitlesFragment;
        this.rv_dieses_name_appbar_name = rv_dieses_name_appbar_name;
        this.subtitle=subtitle;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RemedyFragment(rv_dieses_name_appbar_name);
            case 1:
                return new DietFragment(rv_dieses_name_appbar_name);
            case 2:
                return new ExersiseFragment(rv_dieses_name_appbar_name);
            default:
                throw new IllegalStateException("Unexpected position: " + position);
        }
    }

    @Override
    public int getItemCount() {
        return subTabTitlesFragment.length;
    }

    public String getSubTabTitle(int position) {
        return subTabTitlesFragment[position];
    }
    public String gettitle_remedy_diet(int position) {
        return subtitle[position];
    }
}
