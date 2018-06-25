package e.wilso.project_sleep.advance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import e.wilso.project_sleep.R;

public class LanguageActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_language);

      getSupportActionBar().setTitle("Language");
      setBackbutton();
   }

   private void setBackbutton() {
      if(getSupportActionBar() != null) {
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setDisplayShowHomeEnabled(true);
      }
   }

   @Override
   public void onBackPressed() {
      int count = getFragmentManager().getBackStackEntryCount();

      if (count == 0) super.onBackPressed();
      else getFragmentManager().popBackStack();
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      if(item.getItemId() == android.R.id.home) finish();

      return super.onOptionsItemSelected(item);
   }
}
