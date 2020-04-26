package com.example.edoofun;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import android.content.ComponentName;

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


public class RegisterActivityTest {
   @Rule
   public ActivityTestRule<Register> mActivity = new ActivityTestRule<>(Register.class);
   private String email = "test@test.com";
   private String nama = "user";
   private String password = "123";


   @Test
    public void changeTextemail(){
       onView(withId(R.id.user_txt2)).perform(typeText(email), closeSoftKeyboard());
   }

   @Test
    public void changeTextName(){
       onView(withId(R.id.user_txt)).perform(typeText(nama), closeSoftKeyboard());
   }

   @Test
    public void changeTextPassword(){
       onView(withId(R.id.editText)).perform(typeText(password), closeSoftKeyboard());
   }
}
