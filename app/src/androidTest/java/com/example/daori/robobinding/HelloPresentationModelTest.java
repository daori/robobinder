package com.example.daori.robobinding;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.view.View;

import com.example.daori.robobinding.modelpresentation.HelloPresentationModel;

import junit.framework.TestCase;

import org.robobinding.presentationmodel.PresentationModelChangeSupport;

import java.util.regex.Matcher;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Created by daori on 1/18/15.
 */
public class HelloPresentationModelTest extends TestCase {

    private static final String INPUT_TEXT = "DAORI";
    private HelloPresentationModel helloPresentationModel;

    @Override
    public void setUp() throws Exception {
        helloPresentationModel = new HelloPresentationModel();
        helloPresentationModel.setName(INPUT_TEXT);
    }

    public void testLabelShouldContainName(){
        String expected = INPUT_TEXT + ": hello Android MVVM(Presentation Model)!";
        assertEquals(expected, helloPresentationModel.getHello());
    }

// Kenapa Menggunakan espresso selalu fail meskipun sudah di rubah menggunakna ActivityInstrumentationTestCase2
//    public void testButtonSayHallo(){
//        String INPUT_TEXT ="DAORI";
//        onView(withId(R.id.button_hello)).perform(click());
//        onView(withId(R.id.input_text)).perform(typeText(INPUT_TEXT));
//        onView(withId(R.id.button_say_hello)).perform(click());
//        onView(withId(R.id.label_text)).check(matches(withText(INPUT_TEXT)));
//        fail("not implemented yet");
//        assertFalse(true);
//    }
}
