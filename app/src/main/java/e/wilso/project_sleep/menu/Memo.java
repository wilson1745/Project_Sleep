package e.wilso.project_sleep.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import e.wilso.project_sleep.R;

public class Memo extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_memo);

      getSupportActionBar().setTitle("Memo");
   }
}
