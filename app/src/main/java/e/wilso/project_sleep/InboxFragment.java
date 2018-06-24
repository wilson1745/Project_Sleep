package e.wilso.project_sleep;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class InboxFragment extends Fragment {


   public InboxFragment() {
      // Required empty public constructor
   }


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      ((MainActivity)getActivity()).setActionBartTitle("Inbox");

      // Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_inbox, container, false);
   }

}
