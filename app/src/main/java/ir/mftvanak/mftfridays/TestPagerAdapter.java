package ir.mftvanak.mftfridays;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestPagerAdapter extends FragmentPagerAdapter {


    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TestFragment();
            case 1:
                return new TestFragment1();
            case 2:
                return new TestFragment2();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "POUYA";
            case 1:
                return "Name";
            case 2:
                return "Family";
            default:
                return "unknown!";
        }
    }
}
