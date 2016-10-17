package ziyi.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Ziyi on 2016/10/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
