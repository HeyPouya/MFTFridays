package ir.mftvanak.mftfridays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class TestFragment2 extends Fragment {


   private static TestFragment2 fragment;


    public TestFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_two, container, false);
    }


   static public TestFragment2 newInstance(){

        if (fragment == null)
            fragment = new TestFragment2();

        return fragment;

    }

}
