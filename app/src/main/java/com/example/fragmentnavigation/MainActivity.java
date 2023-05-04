package com.example.fragmentnavigation;

import static com.example.fragmentnavigation.R.id.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
   HomeFragment homeFragment=new HomeFragment();
   NotificateFragment notificateFragment=new NotificateFragment();
   SettingFragment settingFragment=new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id= item.getItemId();
                if (id==R.id.home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,homeFragment).commit();
                } else if (id==R.id.notification) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,notificateFragment).commit();
                } else if (id==R.id.setting) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,settingFragment).commit();
                }
                return false;
            }
        });
    }
}