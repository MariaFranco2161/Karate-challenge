package com.nttdata.challenge.tasks;

import com.nttdata.challenge.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CART_LINK)
        );
    }

    public static ViewCart view() {
        return instrumented(ViewCart.class);
    }
}
