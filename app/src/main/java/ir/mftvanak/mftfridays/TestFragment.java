package ir.mftvanak.mftfridays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class TestFragment extends Fragment {


   private static TestFragment fragment;


    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }


   static public TestFragment newInstance(){

        if (fragment == null)
            fragment = new TestFragment();

        return fragment;

    }

}
