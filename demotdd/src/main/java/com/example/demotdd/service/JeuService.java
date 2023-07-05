package com.example.demotdd.service;

import com.example.demotdd.model.LePendu;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;

@Service
public class JeuService {

    private final GenererService genererService;



    //Démarrer le jeu
    private LePendu pendu;

    public JeuService(GenererService genererService) {
        this.genererService = genererService;
    }

    public LePendu getPendu() {
        return pendu;
    }
    public LePendu demarrer() throws ExecutionControl.NotImplementedException {
        pendu = new LePendu();
        pendu.setNbEssai(10);
        pendu.setMot(genererService.genererMot());
        return pendu;
    }


    public void genererMasque() {
        StringBuilder masque = new StringBuilder();
        for(int i=0; i < pendu.getMot().length(); i++) {
            masque.append("*");
        }
        pendu.setMasque(masque.toString());

    }

    public void testerChar(char c) {
        StringBuilder masque = new StringBuilder();
        for (int i=0; i < pendu.getMot().length(); i++) {
            if(pendu.getMot().charAt(i) == c){
                masque.append(c);
            }else {
                masque.append(pendu.getMasque().charAt(i));
            }
        }
        pendu.setMasque(masque.toString());
    }
    //Tester un char

    //Tester si win

}
