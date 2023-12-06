package app.test.dailybeautyapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.adapter.subViewPagerAdapter;

public class FaceActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private subViewPagerAdapter adapter;
    TextView textView;
    String tabName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        viewPager2 = findViewById(R.id.face_viewPager);
        tabLayout = findViewById(R.id.face_tabLayout);
        textView = findViewById(R.id.face_textView_appbar);
        String data = getIntent().getExtras().getString("dieses_name");
        textView.setText(data);
        String dieses = textView.getText().toString();
        String[] tabTitles= {"Remedy", "Diet", "Exersise"};
        adapter = new subViewPagerAdapter(getSupportFragmentManager(), getLifecycle(), tabTitles,dieses,tabTitles);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(adapter.getSubTabTitle(position));
        }).attach();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tabName= adapter.getSubTabTitle(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }


        });
    }
}