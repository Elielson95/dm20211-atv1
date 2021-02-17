package br.mariojp.mobile.atividade;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITest2 {


    private String labelText = "Alô Mundo!";

    private String text = "Enfermeira";

    private String labelText2 = "Olá, Enfermeira!";

    @Before
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void verificaAloMundo() {
        onView(withId(R.id.main_label_mensagem)).check(matches(withText(labelText)));

        onView(withId(R.id.main_edit_nome)).perform(ViewActions.typeText(text));

        onView(withId(R.id.main_botao)).perform(ViewActions.click());

        onView(withId(R.id.main_label_mensagem)).check(matches(withText(labelText2)));

        onView(withId(R.id.main_edit_nome)).check(matches(withText("")));

    }


}
