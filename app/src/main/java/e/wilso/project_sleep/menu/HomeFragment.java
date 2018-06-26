package e.wilso.project_sleep.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import e.wilso.project_sleep.AlarmActivity;
import e.wilso.project_sleep.MainActivity;
import e.wilso.project_sleep.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

   private Button btn_alarm;
   private View view;
   private Intent intent;

   public HomeFragment() {
      // Required empty public constructor
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      ((MainActivity)getActivity()).setActionBartTitle("Home");
      view = inflater.inflate(R.layout.fragment_home, container, false);

      btn_alarm = view.findViewById(R.id.btn_alarm);
      btn_alarm.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            intent = new Intent(getActivity(), AlarmActivity.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "AlarmActivity", Toast.LENGTH_SHORT).show();
         }
      });

      // Inflate the layout for this fragment
      return view;
   }

}
