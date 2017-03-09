package android.ali.com.newsapp;

import android.app.Application;

/**
 * Created by Paul on 3/8/17.
 */

public class NewsApp extends Application {
    // Singleton instance
    private static NewsApp sInstance = null;

    private String userLang;
    private String transLang;

    public String getUserLang() {
        return userLang;
    }

    public void setUserLang(String userLang) {
        this.userLang = userLang;
    }

    public String getTransLang() {
        return transLang;
    }

    public void setTransLang(String transLang) {
        this.transLang = transLang;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Setup singleton instance
        sInstance = this;
    }

    // Getter to access Singleton instance
    public static NewsApp getInstance() {
        return sInstance ;
    }
}