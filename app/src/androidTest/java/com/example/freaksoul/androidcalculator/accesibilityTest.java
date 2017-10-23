package com.example.freaksoul.androidcalculator;

import android.support.test.espresso.contrib.AccessibilityChecks;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by freaksoul on 23/10/2017.
 */

public class accesibilityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public static void acceesibility(){
        AccessibilityChecks.enable().setRunChecksFromRootView(true);
        ;

    }
}
