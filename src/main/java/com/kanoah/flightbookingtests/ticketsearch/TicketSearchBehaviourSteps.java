package com.kanoah.flightbookingtests.ticketsearch;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TicketSearchBehaviourSteps {
    @Given("Eu quero viajar de $de para $para")
    public void dadoQueEuQueroViajarDeUmLugarAOutro(@Named("de") String de, @Named("para") String para) {
        System.out.println("dadoQueEuQueroViajarDeUmLugarAOutro: " + de + " -> " + para);
    }

    @Given("a data de ida é $data")
    public void dadoQueADataDeIdaEh(@Named("data") String data) {
        System.out.println("dadoQueADataDeIdaEh: " + data);
    }

    @Given("a data de volta é $data")
    public void dadoQueADataDeVoltaEh(@Named("data") String data) {
        System.out.println("dadoQueADataDeVoltaEh: " + data);
    }

    @Given("o número de passageiros é $quantidade")
    public void dadoQueONumberoDePassageirosEh(@Named("quantidade") int quantidade) {
        System.out.println("dadoQueONumberoDePassageirosEh: " + quantidade);
    }

    @When("procuro por passagens")
    public void quandoProcuroPorPassagens() {
        System.out.println("quandoProcuroPorPassagens");
    }

    @Then("devo encontrar uma passagem custando $custo")
    public void entaoDevoEncontrarPassagem(@Named("custo") String custo) {
        System.out.println("entaoDevoEncontrarPassagem: "+ custo);
    }
}
