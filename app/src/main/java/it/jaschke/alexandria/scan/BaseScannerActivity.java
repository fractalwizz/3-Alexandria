package it.jaschke.alexandria.scan;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

public class BaseScannerActivity extends ActionBarActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}