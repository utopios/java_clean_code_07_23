package com.example.demotdd.service;


import com.example.demotdd.model.LePendu;
import com.example.demotdd.service.impl.GenererServiceImpl;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JeuServiceTest {

    @InjectMocks
    private JeuService jeuService;

    @Mock
    private GenererService genererService;

    @BeforeEach()
    void setUp() throws ExecutionControl.NotImplementedException {

        //jeuService = new JeuService(new GenererServiceImpl());

    }

    @Test
    public void testMethodeDemarrerDoitCreerJeuAvec10Essai() throws ExecutionControl.NotImplementedException {
        //A => Act
        jeuService.demarrer();
         //Assert
        Assertions.assertEquals(10, jeuService.getPendu().getNbEssai());
    }

    @Test
    public void testMethodeGenererMasqueAvecMotTataDoitRetourner4Etoiles() throws ExecutionControl.NotImplementedException {
        Mockito.when(genererService.genererMot()).thenReturn("tata");
        jeuService.demarrer();
        jeuService.genererMasque();
        Assertions.assertEquals("****", jeuService.getPendu().getMasque());
    }

    @Test
    public void testMethodeGenererMasqueAvecMotGoogleDoitRetourner6Etoiles() throws ExecutionControl.NotImplementedException {
        Mockito.when(genererService.genererMot()).thenReturn("google");
        jeuService.demarrer();
        jeuService.genererMasque();
        Assertions.assertEquals("******", jeuService.getPendu().getMasque());
    }

    @Test
    public void testMethodeTesterCharDoitMettreAjourLeMasque() throws ExecutionControl.NotImplementedException {
        Mockito.when(genererService.genererMot()).thenReturn("google");
        jeuService.demarrer();
        jeuService.genererMasque();

        jeuService.testerChar('g');
        Assertions.assertEquals("g**g**", jeuService.getPendu().getMasque());

    }


}
