package com.example.demotdd.service;

import com.example.demotdd.model.LePendu;
import com.example.demotdd.util.Constant;
import jdk.jshell.spi.ExecutionControl;

public class JeuService {
    //Démarrer le jeu
    private LePendu pendu;

    public LePendu getPendu() {
        return pendu;
    }
    public LePendu demarrer() throws ExecutionControl.NotImplementedException {
        pendu = new LePendu();
        pendu.setNbEssai(10);
        return pendu;
    }
    //Tester un char

    //Tester si win

}
