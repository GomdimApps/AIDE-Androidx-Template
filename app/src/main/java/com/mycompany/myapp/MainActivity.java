package com.mycompany.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
	DrawerLayout drawer;
    androidx.appcompat.widget.Toolbar foodpanda;
    NavigationView navbar;
    ActionBarDrawerToggle hamburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		drawer = (DrawerLayout) findViewById(R.id.drawer);
        foodpanda = (androidx.appcompat.widget.Toolbar) findViewById(R.id.foodpanda);
        navbar = (NavigationView) findViewById(R.id.navbar);
        hamburger = new ActionBarDrawerToggle(this, drawer, foodpanda, R.string.open, R.string.close);
        drawer.addDrawerListener(hamburger);
        hamburger.syncState();
        // configurações do Navigation menu
        navbar.setNavigationItemSelectedListener(
			new NavigationView.OnNavigationItemSelectedListener() {
				@Override
				public boolean onNavigationItemSelected(MenuItem p1) {
					switch (p1.getItemId()) {
						case R.id.item:
							break; }
					return false;
				}
			}
        );
	
	}
	
}

