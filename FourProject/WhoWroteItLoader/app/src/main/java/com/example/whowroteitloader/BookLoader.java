package com.example.whowroteitloader;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;

/**
 * AsyncTaskLoader implementation that opens a network connection and
 * query's the Book Service API.
 */
public class BookLoader extends AsyncTaskLoader<String> {

    // Variable that stores the search string.
    private String mQueryString;

    // Constructor providing a reference to the search term.
    public BookLoader(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

    /**
     * This method is invoked by the LoaderManager whenever the loader is started
     */
    @Override
    protected void onStartLoading() {
        forceLoad(); // Starts the loadInBackground method
    }


    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
}