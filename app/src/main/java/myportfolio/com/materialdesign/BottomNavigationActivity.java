package myportfolio.com.materialdesign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import myportfolio.com.materialdesign.fragment.FavoritesFragment;
import myportfolio.com.materialdesign.fragment.HomeFragment;
import myportfolio.com.materialdesign.fragment.MapFragment;
import myportfolio.com.materialdesign.fragment.MusicFragment;
import myportfolio.com.materialdesign.fragment.PlusOneFragment;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment selectedFragment = null;
        switch (item.getItemId()) {
            case R.id.action_home:
                selectedFragment = new HomeFragment().newInstance();
                break;
            case R.id.action_favorites:
                selectedFragment = new FavoritesFragment().newInstance();
                break;
            case R.id.action_schedules:
                selectedFragment = new PlusOneFragment().newInstance();
                break;
            case R.id.action_music:
                selectedFragment = new MusicFragment().newInstance();
                break;
            case R.id.action_map:
                selectedFragment = new MapFragment().newInstance();
                break;
        }

        /*FragmentManager favfragmentManager = getSupportFragmentManager();
        favfragmentManager.beginTransaction().replace(R.id.main_container, selectedFragment).commit();*/

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, selectedFragment);
        transaction.commit();
        return true;
    }
}
