package com.example.daori.robobinding;

import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

/**
 * Created by daori on 1/13/15.
 */

@org.robobinding.annotation.PresentationModel
public class PresentationModel implements HasPresentationModelChangeSupport {
    private PresentationModelChangeSupport changeSupport;
    private String name;

    public PresentationModel() {
        changeSupport = new PresentationModelChangeSupport(this);
    }

    public String getHello() {
        return name + ": hello Android MVVM(Presentation Model)!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        changeSupport.firePropertyChange("hello");
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return changeSupport;
    }
}