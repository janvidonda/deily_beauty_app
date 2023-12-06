package app.test.dailybeautyapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import app.test.dailybeautyapp2.adapter.mainViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private mainViewPagerAdapter adapter;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView img1_act, img2_act, img3_act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        drawerLayout = findViewById(R.id.drawer_layout);

        img1_act = findViewById(R.id.img_home_salooon);
        img2_act = findViewById(R.id.img_face_saloon);
        img3_act = findViewById(R.id.img_menu);
        navigationView = findViewById(R.id.navigation_activity);
        img1_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeSalonActivity.class);
                startActivity(intent);
            }
        });
        img2_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeSalonActivity.class);
                startActivity(intent);
            }
        });
        img3_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });


        String[] MaintabTitles = {"Hair","Skin","Face","HandsFeet", "Eyes"};
        adapter = new mainViewPagerAdapter(getSupportFragmentManager(), getLifecycle(), MaintabTitles);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(adapter.getTabTitle(position));
        }).attach();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                String tabName = adapter.getTabTitle(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }


        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Skin_Test:
                        Intent intent = new Intent(MainActivity.this, HomeSalonActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.Rate:
                        gotoPlayStore();
                    case R.id.Share:
                        try {
                            Intent shareIntent = new Intent(Intent.ACTION_SEND);
                            shareIntent.setType("text/plain");
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String shareMessage = "\nLet me recommend you this application\n\n";
                            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                            startActivity(Intent.createChooser(shareIntent, "choose one"));
                        } catch (Exception e) {
                            //e.toString();
                        }
                    case R.id.Languages:

                }
                return true;
            }
        });

    }
    public void gotoPlayStore() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(("http://play.google.com/store/apps/details?id=") + this.getPackageName())));
        } catch (ActivityNotFoundException e2) {
            Toast.makeText(getApplicationContext(), "You don't have any app that can open this link", Toast.LENGTH_SHORT).show();
        }
    }
}