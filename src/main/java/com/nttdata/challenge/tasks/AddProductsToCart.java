package com.nttdata.challenge.tasks;

import com.nttdata.challenge.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsToCart implements Task {

    private final List<String> products;

    public AddProductsToCart(List<String> products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (String producto : products) {
            actor.attemptsTo(
                    WaitUntil.the(HomePage.productByName(producto), isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(HomePage.productByName(producto)),
                    Click.on(HomePage.BTN_ADD_TO_CART),
                    Click.on(HomePage.BTN_GO_TO_HOME)
            );
        }
    }

    public static AddProductsToCart add(List<String> products) {
        return instrumented(AddProductsToCart.class, products);
    }
}
