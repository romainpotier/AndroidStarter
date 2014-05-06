package fr.romainpotier.androidstarter;

import java.util.List;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import fr.romainpotier.androidstarter.beans.Movie;
import fr.romainpotier.androidstarter.service.MoviesService;

/**
 * Simple activity for testing REST webservice
 * 
 * @author Romain Potier
 */
@EActivity(R.layout.activity_main)
public class AndroidStarter extends Activity {

    @ViewById
    TextView textView;

    @ViewById
    ListView listView;

    @RestService
    MoviesService moviesService;

    @Click
    void callRestService() {
        callMoviesService();
    }

    @Background
    void callMoviesService() {
        // Call service
        List<Movie> movies = moviesService.getMovies();
        updateListView(movies);
    }

    @UiThread
    void updateListView(final List<Movie> movies) {
        // Create custom adapter
        final ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<Movie>(this, android.R.layout.simple_list_item_1, movies);
        listView.setAdapter(arrayAdapter);
    }

}
