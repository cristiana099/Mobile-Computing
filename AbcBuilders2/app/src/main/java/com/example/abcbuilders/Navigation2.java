package com.example.abcbuilders;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;

public class Navigation2 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.ourlocations, R.id.testimonials, R.id.contactus)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


    public void buttonHome(View view) {

        Intent intent = new Intent(this, ContactUs2.class);
        startActivity(intent);
    }



    public void buttonGallery(View view) {

        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }


    public void buttonLocations(View view) {

        Intent intent = new Intent(this, Locations.class);
        startActivity(intent);
    }


    public void buttonTestimonials(View view) {

        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }


    public void buttonContact(View view) {

        Intent intent = new Intent(this, ContactUs2.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public boolean onNavigationItemSelected(MenuItem item) {

        //Handle navigation view item clicks here.

        int id = item.getItemId();


        if (id == R.id.nav_home){
            Intent intent = new Intent (this, HomeActivity.class);
            startActivity(intent);
        }
        else if ( id == R.id.nav_gallery) {
            Intent intent = new Intent (this, Gallery.class);
            startActivity(intent);
        }
        else if (id == R.id.testimonials){
            Intent intent = new Intent (this, Test.class);
            startActivity(intent);

        }
        else if (id == R.id.ourlocations){
            Intent intent = new Intent (this, Locations.class);
            startActivity(intent);

        }
        else if (id == R.id.contactus){
            Intent intent = new Intent (this, ContactUs2.class);
            startActivity(intent);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

}
