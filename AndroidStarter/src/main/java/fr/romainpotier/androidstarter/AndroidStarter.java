package fr.romainpotier.androidstarter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

@EActivity(R.layout.activity_main)
public class AndroidStarter extends Activity {

    @ViewById
    TextView textView;

    @ViewById
    Button callRestService;

    @AfterViews
    void afterViews() {
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater();
        return true;
    }

}
