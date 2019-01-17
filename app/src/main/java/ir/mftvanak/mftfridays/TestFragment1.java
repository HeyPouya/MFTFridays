package ir.mftvanak.mftfridays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class TestFragment1 extends Fragment {


   private static TestFragment1 fragment;


    public TestFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_one, container, false);
    }


   static public TestFragment1 newInstance(){

        if (fragment == null)
            fragment = new TestFragment1();

        return fragment;

    }

}
