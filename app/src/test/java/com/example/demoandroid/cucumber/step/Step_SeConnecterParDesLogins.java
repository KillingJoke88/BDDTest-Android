package com.example.demoandroid.cucumber.step;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step_SeConnecterParDesLogins {
    @Given("je suis sur la page de login")
    public void je_suis_sur_la_page_de_login() {
        System.out.println("Affichage de l'écran de login");
    }

    @Given("j ai un compte utilisateur")
    public void j_ai_un_compte_utilisateur() {
        System.out.println("J'ai un compte utilisateur");
    }

    @Then("je clique sur la saisie du email")
    public void je_clique_sur_la_saisie_du_email() {
        System.out.println("Je clique sur la zone de saisie de l'email");
    }

    @Then("je saisi mon email {string}")
    public void je_saisi_mon_email(String email) {
        System.out.println("Je saisi mon mail: "+ email);
    }

    @Then("je clique sur la saisie du mot de passe")
    public void je_clique_sur_la_saisie_du_mot_de_passe() {
        System.out.println("Je clique sur la zone de saisie du mot de passe");
    }

    @Then("je saisi mon mot de passe {string}")
    public void je_saisi_mon_mot_de_passe(String password) {
        System.out.println("Je saisi mon mot de passe: "+ password);
    }

    @Then("je clique sur le bouton connexion")
    public void je_clique_sur_le_bouton_connexion() {
        System.out.println("Je clique sur le bouton de connexion");
        Assert.fail("FORCER UNE ERREUR");
    }
}
