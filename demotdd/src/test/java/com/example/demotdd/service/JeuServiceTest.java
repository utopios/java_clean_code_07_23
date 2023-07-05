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
    void setUp() {

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
    public void testMethodeDemarrerDoitGenererUnMasqueDuMotAtrouver() throws ExecutionControl.NotImplementedException {
        Mockito.when(genererService.genererMot()).thenReturn("tata");
        jeuService.demarrer();
        Assertions.assertEquals("****", jeuService.getPendu().getMasque());
    }
}
