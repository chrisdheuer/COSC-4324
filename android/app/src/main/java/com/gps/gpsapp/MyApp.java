package com.gps.gpsapp;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApp extends Application {
    private  static MyApp singleton;
    private static List<Location> myLocation;

    public static List<Location> getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(List<Location> myLocation) {
        this.myLocation = myLocation;
    }

    public MyApp getInstance() {
        return singleton;
    }
    public void onCreate(){
        super.onCreate();
        singleton = this;
        myLocation = new ArrayList<>();
    }
}
