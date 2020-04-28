package com.example.paymentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.paymentapp.RV.PaymentUpcoming;
import com.example.paymentapp.ui.history.HistoryFragment;
import com.example.paymentapp.ui.home.HomeFragment;
import com.example.paymentapp.ui.offers.OffersFragment;
import com.example.paymentapp.ui.payments.PaymentsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener

        {
    public DrawerLayout drawer;
//    public RecyclerView recyclerView1;
//    public RecyclerView.Adapter adapter1;
//    public RecyclerView.LayoutManager layoutManager1;




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment selectedfragment = null;

        switch (menuItem.getItemId()) {
            case R.id.navHome:
                bottomNav.setSelectedItemId(R.id.navHome);
                selectedfragment = new HomeFragment();
                break;
            case R.id.navOffers:
                bottomNav.setSelectedItemId(R.id.navOffers);
                selectedfragment = new OffersFragment();
                break;
            case R.id.navPayment:
                bottomNav.setSelectedItemId(R.id.navPayment);
                selectedfragment = new PaymentsFragment();
                break;
            case R.id.navHistory:
                bottomNav.setSelectedItemId(R.id.navHistory);
                selectedfragment = new HistoryFragment();
                break;

        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container,
                selectedfragment).commit();
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

            BottomNavigationView bottomNav;
            NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bottom navigation
        bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
//        bottomNav.setNavigationItemSelectedListener(this);
//        bottomNav.OnNavigationItemReselectedListener(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
         navigationView = findViewById(R.id.nav_View);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container,
                new HomeFragment()).commit();

//        ArrayList<PaymentUpcoming> paymentList = new ArrayList<>();
//        paymentList.add(new PaymentUpcoming(R.drawable.electricity_icon, "Electricity Bill",
//                "88161184648", "Due Date:  21 may 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.phone_icon, "Phone Bill",
//                "88165445648", "Due Date:  11 june 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.telephone_icon, "Telephone Bill",
//                "82222222648", "Due Date:  25 august 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.train_icon, "Transport Bill",
//                "88111111648", "Due Date:  10 january 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.electricity_icon, "Electricity Bill",
//                "88161184648", "Due Date:  21 may 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.phone_icon, "Phone Bill",
//                "88165445648", "Due Date:  11 june 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.telephone_icon, "Telephone Bill",
//                "82222222648", "Due Date:  25 august 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.train_icon, "Transport Bill",
//                "88111111648", "Due Date:  10 january 2019", "Pay Now"));


//        recyclerView1 = findViewById(R.id.recyclerView);
//        recyclerView1.setHasFixedSize(true);
//        layoutManager1 = new LinearLayoutManager(this);
//        adapter1 = new PaymentAdapter(paymentList);
//
//        recyclerView1.setLayoutManager(layoutManager1);
//        recyclerView1.setAdapter(adapter1);



    }

    // bottom nav switch code
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {
                        case R.id.navHome:
                            navigationView.setCheckedItem(R.id.navHome);
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navOffers:
                            navigationView.setCheckedItem(R.id.navOffers);
                            selectedFragment = new OffersFragment();
                            break;
                        case R.id.navPayment:
                            navigationView.setCheckedItem(R.id.navPayment);
                            selectedFragment = new PaymentsFragment();
                            break;
                        case R.id.navHistory:
                            navigationView.setCheckedItem(R.id.navHistory);
                            selectedFragment = new HistoryFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container,
                            selectedFragment).commit();

                    return true;
                }
            };





    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void rechargeMobile(View view) {


        // handle tap on mobile icon
        Intent intent = new Intent(this, RechargeMobile.class);
        startActivity(intent);

    }

            public void rechargeDth(View view) {


                // handle tap on mobile icon
                Intent intent = new Intent(this, RechargeDTH.class);
                startActivity(intent);

            }

            public void addMoney(View view) {


                //handle the tap on add money button
                Intent intent = new Intent(this, AddMoney.class);
                startActivity(intent);

            }

            public void payNow(View view) {


                //handle the tap on add money button
                Intent intent = new Intent(this, Success.class);
                startActivity(intent);

            }





}



