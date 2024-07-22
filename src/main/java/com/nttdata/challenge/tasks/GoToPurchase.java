package com.nttdata.challenge.tasks;

import com.nttdata.challenge.userinterface.CartPage;
import com.nttdata.challenge.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToPurchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPage.BTN_PLACE_ORDER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CartPage.BTN_PLACE_ORDER)
        );
    }

    public static GoToPurchase goToPurchase() {
        return instrumented(GoToPurchase.class);
    }
}
