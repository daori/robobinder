package com.example.daori.robobinding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.daori.robobinding.modelpresentation.HelloPresentationModel;

import org.robobinding.binder.Binders;

/**
 * Created by daori on 1/14/15.
 */
public class HelloActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HelloPresentationModel helloPresentationModel = new HelloPresentationModel();
        View viewRoot = Binders.inflateAndBindWithoutPreInitializingViews(this, R.layout.hello_activity, helloPresentationModel);

        setContentView(viewRoot);
    }
}
