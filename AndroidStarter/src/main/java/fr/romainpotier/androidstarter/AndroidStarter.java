package fr.romainpotier.androidstarter;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

@EActivity(R.layout.activity_main)
public class AndroidStarter extends Activity {

    @ViewById
    TextView textView;

    @Click
    void callRestService() {
        // callre
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater();
        return true;
    }

}
