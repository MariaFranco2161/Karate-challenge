package com.nttdata.challenge.tasks;

import com.nttdata.challenge.userinterface.HomePage;
import com.nttdata.challenge.userinterface.PurchaseFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletePurchaseForm implements Task {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public CompletePurchaseForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PurchaseFormPage.NAME_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PurchaseFormPage.NAME_FIELD),
                WaitUntil.the(PurchaseFormPage.COUNTRY_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PurchaseFormPage.COUNTRY_FIELD),
                WaitUntil.the(PurchaseFormPage.CITY_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchaseFormPage.CITY_FIELD),
                WaitUntil.the(PurchaseFormPage.CARD_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(card).into(PurchaseFormPage.CARD_FIELD),
                WaitUntil.the(PurchaseFormPage.MONTH_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PurchaseFormPage.MONTH_FIELD),
                WaitUntil.the(PurchaseFormPage.YEAR_FIELD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PurchaseFormPage.YEAR_FIELD),
                WaitUntil.the(PurchaseFormPage.PURCHASE_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseFormPage.PURCHASE_BUTTON)
        );
    }

    public static CompletePurchaseForm with(String name, String country, String city, String card, String month, String year) {
        return instrumented(CompletePurchaseForm.class, name, country, city, card, month, year);
    }
}