package fr.romainpotier.androidstarter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.view.Menu;

@EActivity(R.layout.activity_main)
public class AndroidStarter extends Activity {

    @AfterViews
    void afterViews() {
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater();
        return true;
    }

}
