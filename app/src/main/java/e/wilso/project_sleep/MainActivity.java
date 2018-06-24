package e.wilso.project_sleep;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import e.wilso.project_sleep.menu.AdvanceFragment;
import e.wilso.project_sleep.menu.HomeFragment;
import e.wilso.project_sleep.menu.SettingActivity;
import e.wilso.project_sleep.menu.TrendFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   private Intent intent;

   private Toolbar toolbar;
   private DrawerLayout drawer;
   private ActionBarDrawerToggle toggle;
   private NavigationView navigationView;
   private android.support.v4.app.FragmentTransaction ft;

   private final String TAG = "MainActivity";

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      makeToolbar();
      makeDrawerLayout();
      makeNavigationView();
      makeFramentTransaction();

      navigationView.setCheckedItem(R.id.nav_home);
   }

   @SuppressWarnings("StatementWithEmptyBody")
   @Override
   public boolean onNavigationItemSelected(MenuItem item) {
      // Handle navigation view item clicks here.
      int id = item.getItemId();

      if (id == R.id.nav_home) {
         android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
         ft.replace(R.id.flMain, new HomeFragment());
         ft.commit();
      }
      else if (id == R.id.nav_trend) {
         android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
         ft.replace(R.id.flMain, new TrendFragment());
         ft.commit();
      }
      else if (id == R.id.nav_advance) {
         android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
         ft.replace(R.id.flMain, new AdvanceFragment());
         ft.commit();
      }


      else if (id == R.id.nav_setting) {
         intent = new Intent(this, SettingActivity.class);
         startActivity(intent);
      }

      DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
      drawer.closeDrawer(GravityCompat.START);
      return true;
   }

   private void makeToolbar() {
      toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
   }

   private void makeDrawerLayout() {
      drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
      toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
      drawer.addDrawerListener(toggle);
      toggle.syncState();
   }

   private void makeNavigationView() {
      navigationView = (NavigationView) findViewById(R.id.nav_view);
      navigationView.setNavigationItemSelectedListener(this);
   }

   private void makeFramentTransaction() {
      //default fragment for Home
      ft = getSupportFragmentManager().beginTransaction();
      ft.replace(R.id.flMain, new HomeFragment());
      ft.commit();
   }

   public void setActionBartTitle(String title) {
      getSupportActionBar().setTitle(title);
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
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();

      //noinspection SimplifiableIfStatement
      if (id == R.id.action_settings) {
         return true;
      }

      return super.onOptionsItemSelected(item);
   }
}
