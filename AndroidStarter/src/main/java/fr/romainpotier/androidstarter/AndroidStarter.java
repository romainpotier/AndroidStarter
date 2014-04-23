package fr.romainpotier.androidstarter;

import java.util.List;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import fr.romainpotier.androidstarter.beans.Movie;
import fr.romainpotier.androidstarter.service.MoviesService;

@EActivity(R.layout.activity_main)
public class AndroidStarter extends Activity {

    @ViewById
    TextView textView;

    @RestService
    MoviesService moviesService;

    @Click
    void callRestService() {
        List<Movie> movies = moviesService.getMovies();
        Log.d("MyTag", movies.get(0).getTitle());
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater();
        return true;
    }

}
