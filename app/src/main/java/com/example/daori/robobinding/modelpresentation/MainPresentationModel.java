package com.example.daori.robobinding.modelpresentation;

import android.content.Context;
import android.content.Intent;

import com.example.daori.robobinding.HelloActivity;
import com.example.daori.robobinding.ListViewAdapterActivity;

import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

/**
 * Created by daori on 1/14/15.
 */
@org.robobinding.annotation.PresentationModel
public class MainPresentationModel  implements HasPresentationModelChangeSupport{
    private Context context;
    private PresentationModelChangeSupport changeSupport;

    public MainPresentationModel(Context context) {
        this.context = context;
        this.changeSupport = new PresentationModelChangeSupport(this);
    }

    public void callHelloWorld(){
        Intent intent = new Intent(context.getApplicationContext(), HelloActivity.class);
        context.startActivity(intent);
    }

    public void callListView(){
        Intent intent = new Intent(context.getApplicationContext(), ListViewAdapterActivity.class);
        context.startActivity(intent);
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return changeSupport;
    }
}
