package com.example.sellerapp.Activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.sellerapp.Fragment.Dashboard;
import com.example.sellerapp.Fragment.Feedback;
import com.example.sellerapp.Fragment.Membershipplans;
import com.example.sellerapp.Fragment.Notification;
import com.example.sellerapp.Fragment.Orders;
import com.example.sellerapp.Fragment.Payment;
import com.example.sellerapp.Fragment.Productlisting;
import com.example.sellerapp.Fragment.Return;
import com.example.sellerapp.Fragment.Settings;
import com.example.sellerapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Fragment fragment;
    FragmentTransaction ft;
    Dashboard dashboard;
    Productlisting productlisting;
    Orders orders;
    Return aReturn;
    Payment payment;
    Notification notification;
    Membershipplans membershipplans;
    Feedback feedback;
    Settings settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        loadDbHomefragment();
    }
    private void loadDbHomefragment() {
        dashboard = new Dashboard();
        fragment = dashboard;
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.db_frame,fragment);
        ft.commitAllowingStateLoss();
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.Dashboard) {
            loadDbHomefragment();
        } else if (id == R.id.productlisting) {
            productlisting = new Productlisting();
            fragment = productlisting;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        } else if (id == R.id.orders) {
            orders = new Orders();
            fragment = orders;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        } else if (id == R.id.returns) {
            aReturn = new Return();
            fragment = aReturn;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.payment) {
            payment = new Payment();
            fragment = payment;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.notifiation) {
            notification = new Notification();
            fragment = notification;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.memberplans) {
            membershipplans = new Membershipplans();
            fragment = membershipplans;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.feedback) {
            feedback = new Feedback();
            fragment = feedback;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.settings) {
            settings = new Settings();
            fragment = settings;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }else if (id == R.id.logout) {
            settings = new Settings();
            fragment = settings;
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.db_frame,fragment);
            ft.commitAllowingStateLoss();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}