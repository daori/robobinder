package com.example.daori.robobinding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.daori.robobinding.modelpresentation.MainPresentationModel;

import org.robobinding.binder.Binders;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainPresentationModel mainPresentationModel = new MainPresentationModel(this);
        View rootView = Binders.inflateAndBindWithoutPreInitializingViews(this, R.layout.activity_main, mainPresentationModel);

        setContentView(rootView);
    }

}
