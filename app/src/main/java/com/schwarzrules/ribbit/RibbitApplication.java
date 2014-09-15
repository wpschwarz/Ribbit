package com.schwarzrules.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Will on 9/9/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "EHl6ztLwsnhM4bfSfhblmEd8NoCF6HjJSMkGnYgM", "TJ6pdzpgtBEkDsJC6byQjF0XPGz1wA7EwEIM91qM");

    }
}
