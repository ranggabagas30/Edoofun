package com.example.edoofun;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<GrupmancingActivity> mActivity = new ActivityTestRule<>(GrupmancingActivity.class);

    @Test
    public void testannouncement(){
        onView(withId(R.id.btnAnnouncement)).perform(click());
    }


}
