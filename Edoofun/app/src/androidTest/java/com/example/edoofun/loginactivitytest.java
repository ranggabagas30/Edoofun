package com.example.edoofun;

import android.content.ComponentName;

import androidx.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.InstrumentationRegistry.getTargetContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.hasErrorText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;

public class loginactivitytest {

    @Rule
    public IntentsTestRule<MainActivity> mActivity = new IntentsTestRule<>(MainActivity.class);

    private String username = "yuniariyani";
    private String password = "test";

    @Test
    public void usernameInputEdittable(){
        onView(withId(R.id.user_txt)).perform(typeText(username), closeSoftKeyboard());
    }

    @Test
    public void ClickLoginButton(){
        onView(withId(R.id.user_txt)).perform(replaceText(username), closeSoftKeyboard());
        onView(withId(R.id.password_txt)).perform(replaceText(password), closeSoftKeyboard());
        onView(withId(R.id.btn_login1)).perform(click());
    }

    @Test
    public void emailIsInvalid(){
        onView(withId(R.id.user_txt)).perform(replaceText(username), closeSoftKeyboard());
        onView(withId(R.id.btn_login1)).perform(click());
        onView(withId(R.id.user_txt)).check(matches(hasErrorText("enter a valid email address")));
    }

    @Test
    public void loginSuccess(){
        onView(withId(R.id.user_txt)).perform(replaceText("yuniariyaniar"), closeSoftKeyboard());
        onView(withId(R.id.password_txt)).perform(replaceText("123456"), closeSoftKeyboard());
        onView(withId(R.id.btn_login1)).perform(click());
        intended(hasComponent(new ComponentName(getTargetContext(),MainActivity.class)));
    }

}
