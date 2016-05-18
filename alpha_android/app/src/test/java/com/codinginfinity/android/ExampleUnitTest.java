package com.codinginfinity.android;

import android.content.Intent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

        @Test
        public void clickingLogin_shouldStartLoginActivity() {
            LoginActivity activity = Robolectric.setupActivity(LoginActivity.class);
            MainActivity activity2 = Robolectric.setupActivity(MainActivity.class);
            activity.findViewById(R.id.btn_login).performClick();

            Intent expectedIntent = new Intent(activity, MainActivity.class);
            //assertFalse(expectedIntent,activity);
            assertEquals(expectedIntent,activity);

            //assertThat(Robolectric.shadowOf_(activity).getNextStartedActivity()).isEqualTo(expectedIntent);
        }

    @Test
    public  void viewPublication()
    {
        ViewPublicationsActivity activity = Robolectric.setupActivity(ViewPublicationsActivity.class);
        MainActivity activity2 = Robolectric.setupActivity( MainActivity.class);

        activity2.findViewById(R.id.viewpublications).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        //assertFalse(expectedIntent,activity);
        assertEquals(expectedIntent,activity2);
    }

    @Test
    public  void userProfile()
    {
        editUserActivity activity = Robolectric.setupActivity(editUserActivity.class);
        MainActivity activity2 = Robolectric.setupActivity( MainActivity.class);

        activity2.findViewById(R.id.imgBtn_EditProfile).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        //assertFalse(expectedIntent,activity);
        assertEquals(expectedIntent,activity2);
    }

    @Test
    public  void addPublication()
    {
        AddPublication activity = Robolectric.setupActivity(AddPublication.class);
        MainActivity activity2 = Robolectric.setupActivity( MainActivity.class);
        activity.findViewById(R.id.btn_login).performClick();
        activity2.findViewById(R.id.add_publication).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        //assertFalse(expectedIntent,activity);
        assertEquals(expectedIntent,activity2);
    }

    @Test
    public  void editpublication()
    {
        EditPublication activity = Robolectric.setupActivity(EditPublication.class);
        ViewPublicationsActivity activity2 = Robolectric.setupActivity( ViewPublicationsActivity.class);

        activity2.findViewById(R.id.viewpublications).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        //assertFalse(expectedIntent,activity);
        assertEquals(expectedIntent,activity2);
    }

}