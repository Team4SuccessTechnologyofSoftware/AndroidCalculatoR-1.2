package com.example.freaksoul.androidcalculator;

import android.support.test.espresso.contrib.AccessibilityChecks;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.*;
import android.support.test.rule.*;
import android.view.View;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.*;



/**
 * Created by freaksoul on 23/10/2017.
 */
@RunWith(AndroidJUnit4.class)

@LargeTest
public class ButtonsClickTest{

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
            public void checkButtons() {
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("Result1")));
        onView(withId(R.id.buttonClear)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("")));
        onView(withText("3")).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("3")));
        onView(withText("4")).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("34")));
        onView(withId(R.id.buttonClear)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("567")));
        onView(withId(R.id.buttonClear)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("")));
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("8")));
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("89")));
        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("890")));
        onView(withId(R.id.buttonClear)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("")));

    }

}
